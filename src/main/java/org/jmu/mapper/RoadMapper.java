package org.jmu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.jmu.entity.Road;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RoadMapper {
    //插入数据，并返回主键
    int insertInfo(Road road);

    int deleteByPrimaryKey(Integer roadId);

    int insert(Road record);

    int insertSelective(Road record);

    Road selectByPrimaryKey(Integer roadId);

    int updateByPrimaryKeySelective(Road record);

    int updateByPrimaryKey(Road record);
}