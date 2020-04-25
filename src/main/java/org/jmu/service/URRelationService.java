package org.jmu.service;

import org.jmu.entity.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface URRelationService {
    //插入维修完成的工作记录到数据库
    public boolean addWorkRecore(String firstPicUrl,String secondPicUrl,String thirdPicUrl,int userId,String urrInfo);
    //上传图片到数据库
    public ResponseEntity insertImgInfo(MultipartFile file) throws IOException;
}
