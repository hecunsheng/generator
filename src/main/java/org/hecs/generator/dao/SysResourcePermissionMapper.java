package org.hecs.generator.dao;

import org.hecs.generator.model.SysResourcePermission;
import org.hecs.generator.model.SysResourcePermissionKey;

public interface SysResourcePermissionMapper {
    int deleteByPrimaryKey(SysResourcePermissionKey key);

    int insert(SysResourcePermission record);

    int insertSelective(SysResourcePermission record);

    SysResourcePermission selectByPrimaryKey(SysResourcePermissionKey key);

    int updateByPrimaryKeySelective(SysResourcePermission record);

    int updateByPrimaryKey(SysResourcePermission record);
}