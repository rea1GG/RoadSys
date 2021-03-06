package org.jmu.controller;

import org.jmu.entity.ResponseEntity;
import org.jmu.entity.Road;
import org.jmu.entity.URRelation;
import org.jmu.service.ProtectRoadService;
import org.jmu.service.RoadService;
import org.jmu.service.URRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriBuilder;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@RestController
public class URRelationController {
    @Autowired
    URRelationService urRelationService;
    //引入ProtectRoad，为了在用户上传工作记录之后，将待维修的道路tag改为1
    @Autowired
    ProtectRoadService protectRoadService;
    //引入Road为了主键回调
    @Autowired
    RoadService roadService;

    @RequestMapping("/android/work/upload")
    public ResponseEntity wordUpload(@RequestParam("file") MultipartFile[] files, int userId, String urrInfo, int prId) throws IOException {
        ResponseEntity responseEntity = new ResponseEntity();
        int roadId = protectRoadService.selectRoadIdById(prId);
        List urlList = new ArrayList();
        int i = 0;
        for (MultipartFile f : files) {

            urlList.add(urRelationService.insertImgInfo(f, i).getData().toString());
            System.out.println(urlList.get(i));
            i++;
        }

        if (!urRelationService.addWorkRecore(roadId, urlList.get(0).toString(), urlList.get(1).toString(), urlList.get(2).toString(), userId, urrInfo)) {
            responseEntity.setCode(500);
            responseEntity.setMsg("插入失败");
        } else {
            responseEntity.setCode(200);
            responseEntity.setMsg("插入成功");
            protectRoadService.updateTag(prId);
        }
        return responseEntity;
    }

    @RequestMapping("/android/work/query/time")
    public List<URRelation> selectByTime(Timestamp beginTime, Timestamp endTime) {
        return urRelationService.selectByTime(beginTime, endTime);
    }

    @RequestMapping("/android/work/query/name/{userName}")
    public List<URRelation> selectByName(@PathVariable(value = "userName")String userName) {
        return urRelationService.selectByName(userName);
    }

    @RequestMapping("/android/work/query/area/{roadArea}")
    public List<URRelation> selectByArea(@PathVariable(value = "roadArea")String roadArea) {
        return urRelationService.selectByArea(roadArea);
    }
    @RequestMapping("/android/work/query/all")
    public List<URRelation> selectAll(){
        return urRelationService.selectAll();
    }
    @RequestMapping("/android/work/query/id/{urrId}")
    public URRelation selectById(@PathVariable(value = "urrId") int urrId){
        return urRelationService.selectByUrrId(urrId);
    }
}
