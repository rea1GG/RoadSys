package org.jmu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.jmu.entity.URRelation;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Mapper
@Repository
public interface URRelationMapper {
    int deleteByPrimaryKey(Integer urrId);

    int insert(URRelation record);

    int insertSelective(URRelation record);

    //插入工作记录
    int insertWorkRecord(int roadId,String firstPicUrl, String secondPicUrl, String thirdPicUrl, int userId, String urrInfo);
    //按时间查询工作记录
    public List<URRelation> selectByTime(Timestamp beginTime,Timestamp endTime);
    //按用户id查询工作记录
    public List<URRelation> selectByUserName(String userName);
    //按地域查询
    public  List<URRelation> selectByArea(String roadArea);
    //查询所有
    public List<URRelation> selectAll();
    //根据id查询
    public URRelation selectByUrrId(int urrId);
    URRelation selectByPrimaryKey(Integer urrId);

    int updateByPrimaryKeySelective(URRelation record);

    int updateByPrimaryKey(URRelation record);
}