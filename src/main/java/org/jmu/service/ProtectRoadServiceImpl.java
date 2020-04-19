package org.jmu.service;

import org.jmu.entity.ProtectRoad;
import org.jmu.mapper.ProtectRoadMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProtectRoadServiceImpl implements ProtectRoadService {

    @Autowired
    ProtectRoadMapper protectRoadMapper;

    @Override
    public boolean insertRoadInfo(ProtectRoad protectRoad) {
        return  protectRoadMapper.insertSelective(protectRoad)>0;
    }
}
