package org.jmu.controller;

import org.jmu.entity.ProtectRoad;
import org.jmu.service.ProtectRoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
public class ProtectRoadController {
    @Autowired
    ProtectRoadService protectRoadService;
//    @RequestMapping("/commit/need/upload")
//    public String insertImg(String imgFile){
//        Base64 base64 = new Base64();
//
//    }

    @RequestMapping("/commit/needprotect")
    public boolean insertNeedProtectRoadInfo(ProtectRoad protectRoad){
        return protectRoadService.insertRoadInfo(protectRoad);
    }
}
