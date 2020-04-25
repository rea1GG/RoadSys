package org.jmu.service;

import org.jmu.entity.ProtectRoad;
import org.jmu.entity.ResponseEntity;
import org.jmu.mapper.ProtectRoadMapper;
import org.jmu.util.TimeFormat;
import org.jmu.util.UploadFileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

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
        UploadFileUtil fileUtil = new UploadFileUtil();
        return fileUtil.uploadFile(file);

    }

    @Override
    public boolean addImgToDb(String picUrl,int userId,String prInfo) {
        return protectRoadMapper.addImgToDb(picUrl,userId,prInfo)>0;
    }

    @Override
    public boolean updateTag(int prId) {
        return protectRoadMapper.updateTag(prId)>0;
    }

    @Override
    public List<ProtectRoad> selectByTag() {
        return protectRoadMapper.selectByTag();
    }

    @Override
    public ResponseEntity insertInfo(int userId, String prInfo) {
        ResponseEntity responseEntity = new ResponseEntity();
        if(protectRoadMapper.addInfo(userId,prInfo)>1){
            responseEntity.setCode(200);
            responseEntity.setMsg("success");
        }else{
            responseEntity.setCode(500);
            responseEntity.setMsg("fail");
        }
        return responseEntity;
    }
}
