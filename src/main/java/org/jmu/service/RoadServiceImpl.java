package org.jmu.service;

import org.jmu.entity.Road;
import org.jmu.mapper.RoadMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoadServiceImpl implements RoadService {
    @Autowired
    RoadMapper roadMapper;

    @Override
    public int insetInfo(Road road) {
        roadMapper.insertInfo(road);
        return road.getRoadId();
    }
}
