package org.jmu.service;

import org.jmu.entity.ProtectRoad;
import org.jmu.entity.ResponseEntity;
import org.jmu.mapper.ProtectRoadMapper;
import org.jmu.util.TimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class ProtectRoadServiceImpl implements ProtectRoadService {

    @Autowired
    ProtectRoadMapper protectRoadMapper;

    @Override
    public boolean insertRoadInfo(ProtectRoad protectRoad) {
        return  protectRoadMapper.insertSelective(protectRoad)>0;
    }

    @Override
    public ResponseEntity insertImgInfo(MultipartFile file) throws IOException {
        ResponseEntity responseEntity = new ResponseEntity();
        TimeFormat timeFormat = new TimeFormat();
        if(file.isEmpty()){
            responseEntity.setCode(300);
            responseEntity.setMsg("文件为空");
            return responseEntity;
        }
        String originalFileName = file.getOriginalFilename();
        String fileName = timeFormat.dateFormat(System.currentTimeMillis()) +"."+originalFileName.substring(originalFileName.lastIndexOf(".")+1);
        String filePath = "E:\\Road\\";
        File uploadFile = new File(filePath+fileName);
        if(!uploadFile.getParentFile().exists()){
            uploadFile.getParentFile().mkdirs();
        }
        FileCopyUtils.copy(file.getInputStream(),new FileOutputStream(uploadFile));
        responseEntity.setCode(200);
        responseEntity.setMsg("上传成功");
        responseEntity.setData(uploadFile);
        return responseEntity;
    }

    @Override
    public boolean addImgToDb(String picUrl, int userId) {
        return protectRoadMapper.addImgToDb(picUrl,userId)>0;
    }
}
