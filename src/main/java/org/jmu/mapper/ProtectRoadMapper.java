package org.jmu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.jmu.entity.ProtectRoad;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ProtectRoadMapper {
    int deleteByPrimaryKey(Integer prId);

    int insert(ProtectRoad record);
    //通过mybatis反向工程生成的insert来实现对需要道路维护的信息添加
    int insertSelective(ProtectRoad record);

    public int addImgToDb(String picUrl,int userId);

    ProtectRoad selectByPrimaryKey(Integer prId);

    int updateByPrimaryKeySelective(ProtectRoad record);

    int updateByPrimaryKey(ProtectRoad record);
}