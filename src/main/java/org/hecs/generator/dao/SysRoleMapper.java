package org.hecs.generator.dao;

import org.hecs.generator.model.SysRole;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Object id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}