package org.jmu.controller;

import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.cfg.context.CrossParameterConstraintMappingContext;
import org.jmu.entity.ProtectRoad;
import org.jmu.entity.ResponseEntity;
import org.jmu.entity.Road;
import org.jmu.entity.User;
import org.jmu.service.ProtectRoadService;
import org.jmu.service.RoadService;
import org.jmu.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@RestController
public class ProtectRoadController {
    @Autowired
    ProtectRoadService protectRoadService;
    @Autowired
    RoadService roadService;
//    @RequestMapping("/commit/need/upload")
//    public boolean insertImg(String imgPic){
//        return protectRoadService.insertImgInfo(imgPic);
//    }

    @RequestMapping("/commit/needprotect")
    public boolean insertNeedProtectRoadInfo(ProtectRoad protectRoad){
        return protectRoadService.insertRoadInfo(protectRoad);
    }

    @RequestMapping("/android/need/upload")
    public ResponseEntity needUpload(@RequestParam("file") MultipartFile file,int userId,String prInfo,String roadArea,String roadName,String roadInfo) throws IOException {
        ResponseEntity responseEntity = new ResponseEntity();
        Road road = new Road();
        road.setRoadArea(roadArea);
        road.setRoadName(roadName);
        road.setRoadInfo(roadInfo);
        String picUrl = protectRoadService.insertImgInfo(file).getData().toString();
        System.out.println(picUrl);
        int roadId = roadService.insetInfo(road);
        if(!protectRoadService.addImgToDb(roadId,picUrl,userId,prInfo)){
            responseEntity.setCode(500);
            responseEntity.setMsg("插入失败");
        }
        return protectRoadService.insertImgInfo(file);
    }
    @RequestMapping("/android/need/query")
    public List<ProtectRoad> selectByTag(){
        return protectRoadService.selectByTag();
    }
    @RequestMapping("/android/need/query/simple")
    public List<ProtectRoad> selectSimpleInfo(){
        return protectRoadService.selectSimpleInfo();
    }
    @RequestMapping("/android/need/query/id/{prId}")
    public ProtectRoad selectByPrId(@PathVariable(value = "prId") int prId){
        return protectRoadService.selectByPrId(prId);
    }
    @RequestMapping("/test")
    public ResponseEntity test(int userId,String prInfo){
        return protectRoadService.insertInfo(userId,prInfo);
    }
}
