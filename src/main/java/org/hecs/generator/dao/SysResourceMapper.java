package org.hecs.generator.dao;

import org.hecs.generator.model.SysResource;

public interface SysResourceMapper {
    int deleteByPrimaryKey(Object id);

    int insert(SysResource record);

    int insertSelective(SysResource record);

    SysResource selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(SysResource record);

    int updateByPrimaryKey(SysResource record);
}