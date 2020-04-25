package org.jmu.service;

import org.jmu.entity.ResponseEntity;
import org.jmu.mapper.URRelationMapper;
import org.jmu.util.UploadFileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class URRelationServiceImpl implements URRelationService {

    @Autowired
    URRelationMapper urRelationMapper;

    @Override
    public boolean addWorkRecore(String firstPicUrl, String secondPicUrl, String thirdPicUrl, int userId, String urrInfo) {
        if(urRelationMapper.insertWorkRecord(firstPicUrl,secondPicUrl,thirdPicUrl,userId,urrInfo)>0)
            return true;
        else
            return false;
    }

    @Override
    public ResponseEntity insertImgInfo(MultipartFile file) throws IOException {
        UploadFileUtil fileUtil = new UploadFileUtil();

        return fileUtil.uploadFile(file);
    }
}
