package org.jmu.service;

import org.jmu.entity.ProtectRoad;

public interface ProtectRoadService {
    //需要维护的道路信息添加
    public boolean insertRoadInfo(ProtectRoad protectRoad);
}
