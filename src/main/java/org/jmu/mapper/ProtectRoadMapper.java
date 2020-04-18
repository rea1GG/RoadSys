package org.jmu.mapper;

import org.jmu.entity.ProtectRoad;

public interface ProtectRoadMapper {
    int deleteByPrimaryKey(Integer prId);

    int insert(ProtectRoad record);

    int insertSelective(ProtectRoad record);

    ProtectRoad selectByPrimaryKey(Integer prId);

    int updateByPrimaryKeySelective(ProtectRoad record);

    int updateByPrimaryKey(ProtectRoad record);
}