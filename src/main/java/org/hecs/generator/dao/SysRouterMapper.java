package org.hecs.generator.dao;

import org.hecs.generator.model.SysRouter;

public interface SysRouterMapper {
    int deleteByPrimaryKey(Object id);

    int insert(SysRouter record);

    int insertSelective(SysRouter record);

    SysRouter selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(SysRouter record);

    int updateByPrimaryKey(SysRouter record);
}