package org.jmu.service;

import org.jmu.entity.ProtectRoad;
import org.jmu.entity.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProtectRoadService {
    //需要维护的道路信息添加
    public boolean insertRoadInfo(ProtectRoad protectRoad);
    //添加图片
    public ResponseEntity insertImgInfo(MultipartFile file) throws IOException;
    //插入需要维护的道路信息到数据库
    public boolean addImgToDb(String picUrl,int userId,String prInfo);
    //修改需要维护道路的tag
    public boolean updateTag(int prId);
    //查询tag为0的道路信息
    public List<ProtectRoad> selectByTag();
    //test
    public ResponseEntity insertInfo(int userId,String prInfo);
}
