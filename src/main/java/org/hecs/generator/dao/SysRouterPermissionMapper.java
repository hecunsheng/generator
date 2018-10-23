package org.hecs.generator.dao;

import org.hecs.generator.model.SysRouterPermission;
import org.hecs.generator.model.SysRouterPermissionKey;

public interface SysRouterPermissionMapper {
    int deleteByPrimaryKey(SysRouterPermissionKey key);

    int insert(SysRouterPermission record);

    int insertSelective(SysRouterPermission record);

    SysRouterPermission selectByPrimaryKey(SysRouterPermissionKey key);

    int updateByPrimaryKeySelective(SysRouterPermission record);

    int updateByPrimaryKey(SysRouterPermission record);
}