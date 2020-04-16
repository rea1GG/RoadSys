package org.jmu.mapper;

import org.jmu.entity.URRelation;

public interface URRelationMapper {
    int deleteByPrimaryKey(Integer urrId);

    int insert(URRelation record);

    int insertSelective(URRelation record);

    URRelation selectByPrimaryKey(Integer urrId);

    int updateByPrimaryKeySelective(URRelation record);

    int updateByPrimaryKey(URRelation record);
}