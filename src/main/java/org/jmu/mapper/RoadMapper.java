package org.jmu.mapper;

import org.jmu.entity.Road;

public interface RoadMapper {
    int deleteByPrimaryKey(Integer roadId);

    int insert(Road record);

    int insertSelective(Road record);

    Road selectByPrimaryKey(Integer roadId);

    int updateByPrimaryKeySelective(Road record);

    int updateByPrimaryKey(Road record);
}