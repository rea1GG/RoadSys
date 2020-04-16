package org.jmu.mapper;

import org.jmu.entity.RoadLocation;

public interface RoadLocationMapper {
    int deleteByPrimaryKey(Integer rlId);

    int insert(RoadLocation record);

    int insertSelective(RoadLocation record);

    RoadLocation selectByPrimaryKey(Integer rlId);

    int updateByPrimaryKeySelective(RoadLocation record);

    int updateByPrimaryKey(RoadLocation record);
}