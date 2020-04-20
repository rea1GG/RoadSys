package org.jmu.controller;

import org.jmu.entity.ProtectRoad;
import org.jmu.service.ProtectRoadService;
import org.jmu.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProtectRoadController {
    @Autowired
    ProtectRoadService protectRoadService;
    @RequestMapping("/commit/need/upload")
    public boolean insertImg(String imgPic){
        return protectRoadService.insertImgInfo(imgPic);
    }

    @RequestMapping("/commit/needprotect")
    public boolean insertNeedProtectRoadInfo(ProtectRoad protectRoad){
        return protectRoadService.insertRoadInfo(protectRoad);
    }
}
