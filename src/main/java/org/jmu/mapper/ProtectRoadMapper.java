package org.jmu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.jmu.entity.ProtectRoad;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProtectRoadMapper {
    int deleteByPrimaryKey(Integer prId);

    int insert(ProtectRoad record);
    //通过mybatis反向工程生成的insert来实现对需要道路维护的信息添加
    int insertSelective(ProtectRoad record);

    public int addImgToDb(int roadId,String picUrl,int userId,String prInfo);

    public int addInfo (int userId, String prInfo);
    //修改ProtectRoad的tag
    public int updateTag(int prId);
    //查询所有待维修的道路信息
    public List<ProtectRoad> selectByTag();
    //查询简单信息
    public List<ProtectRoad> selectSimpleInfo();
    //返回维修的道路的id
    public int selectRoadIdById(int prId);
    //根据prId查询详细信息
    public ProtectRoad selectByPrId(int prId);

    ProtectRoad selectByPrimaryKey(Integer prId);

    int updateByPrimaryKeySelective(ProtectRoad record);

    int updateByPrimaryKey(ProtectRoad record);
}