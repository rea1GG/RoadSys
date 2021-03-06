package org.jmu.service;

import org.jmu.entity.ResponseEntity;
import org.jmu.entity.URRelation;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

public interface URRelationService {
    //插入维修完成的工作记录到数据库
    public boolean addWorkRecore(int roadId,String firstPicUrl,String secondPicUrl,String thirdPicUrl,int userId,String urrInfo);
    //上传图片到数据库
    public ResponseEntity insertImgInfo(MultipartFile file,int fName) throws IOException;
    //查询一个时间段中的工作记录
    public List<URRelation> selectByTime(Timestamp beginTime,Timestamp endTime);
    //通过用户名查询该用户所有工作记录
    public List<URRelation> selectByName(String userName);
    //通过地区查询符合条件的工作记录
    public List<URRelation> selectByArea(String roadArea);
    //查询所有工作记录
    public List<URRelation> selectAll();
    //根据id查询
    public URRelation selectByUrrId(int urrId);
}
