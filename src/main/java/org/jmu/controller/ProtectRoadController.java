package org.jmu.controller;

import org.apache.ibatis.annotations.Param;
import org.jmu.entity.ProtectRoad;
import org.jmu.entity.ResponseEntity;
import org.jmu.entity.User;
import org.jmu.service.ProtectRoadService;
import org.jmu.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@RestController
public class ProtectRoadController {
    @Autowired
    ProtectRoadService protectRoadService;
//    @RequestMapping("/commit/need/upload")
//    public boolean insertImg(String imgPic){
//        return protectRoadService.insertImgInfo(imgPic);
//    }

    @RequestMapping("/commit/needprotect")
    public boolean insertNeedProtectRoadInfo(ProtectRoad protectRoad){
        return protectRoadService.insertRoadInfo(protectRoad);
    }

    @RequestMapping("/android/need/upload")
    public ResponseEntity needUpload(@RequestParam("file") MultipartFile file,int userId,String prInfo) throws IOException {
        ResponseEntity responseEntity = new ResponseEntity();
        String picUrl = protectRoadService.insertImgInfo(file).getData().toString();
        System.out.println(picUrl);
        if(!protectRoadService.addImgToDb(picUrl,userId,prInfo)){
            responseEntity.setCode(500);
            responseEntity.setMsg("插入失败");
        }
        return protectRoadService.insertImgInfo(file);
    }
}
