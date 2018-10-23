package org.hecs.generator.model;

public class SysResource {
    /**
     * 资源ID
     */
    private Object id;

    /**
     * 系统编码
     */
    private Object sysCode;

    /**
     * 资源名称
     */
    private Object resourceName;

    /**
     * 资源编码
     */
    private Object resourceCode;

    /**
     * 资源url
     */
    private Object resourceUrl;

    /**
     * 许可权限点
     */
    private Object permission;

    /**
     * 是否禁用 0启用 1禁用
     */
    private Object isLocked;

    /**
     * 路由ID(所属菜单)
     */
    private Object routerId;

    /**
     * 创建人
     */
    private Object createPerson;

    /**
     * 创建时间
     */
    private Object createTime;

    /**
     * 更新人
     */
    private Object updatePerson;

    /**
     * 更新时间
     */
    private Object updateTime;

    /**
     * 资源ID
     * @return id 资源ID
     */
    public Object getId() {
        return id;
    }

    /**
     * 资源ID
     * @param id 资源ID
     */
    public void setId(Object id) {
        this.id = id;
    }

    /**
     * 系统编码
     * @return sys_code 系统编码
     */
    public Object getSysCode() {
        return sysCode;
    }

    /**
     * 系统编码
     * @param sysCode 系统编码
     */
    public void setSysCode(Object sysCode) {
        this.sysCode = sysCode;
    }

    /**
     * 资源名称
     * @return resource_name 资源名称
     */
    public Object getResourceName() {
        return resourceName;
    }

    /**
     * 资源名称
     * @param resourceName 资源名称
     */
    public void setResourceName(Object resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * 资源编码
     * @return resource_code 资源编码
     */
    public Object getResourceCode() {
        return resourceCode;
    }

    /**
     * 资源编码
     * @param resourceCode 资源编码
     */
    public void setResourceCode(Object resourceCode) {
        this.resourceCode = resourceCode;
    }

    /**
     * 资源url
     * @return resource_url 资源url
     */
    public Object getResourceUrl() {
        return resourceUrl;
    }

    /**
     * 资源url
     * @param resourceUrl 资源url
     */
    public void setResourceUrl(Object resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    /**
     * 许可权限点
     * @return permission 许可权限点
     */
    public Object getPermission() {
        return permission;
    }

    /**
     * 许可权限点
     * @param permission 许可权限点
     */
    public void setPermission(Object permission) {
        this.permission = permission;
    }

    /**
     * 是否禁用 0启用 1禁用
     * @return is_locked 是否禁用 0启用 1禁用
     */
    public Object getIsLocked() {
        return isLocked;
    }

    /**
     * 是否禁用 0启用 1禁用
     * @param isLocked 是否禁用 0启用 1禁用
     */
    public void setIsLocked(Object isLocked) {
        this.isLocked = isLocked;
    }

    /**
     * 路由ID(所属菜单)
     * @return router_id 路由ID(所属菜单)
     */
    public Object getRouterId() {
        return routerId;
    }

    /**
     * 路由ID(所属菜单)
     * @param routerId 路由ID(所属菜单)
     */
    public void setRouterId(Object routerId) {
        this.routerId = routerId;
    }

    /**
     * 创建人
     * @return create_person 创建人
     */
    public Object getCreatePerson() {
        return createPerson;
    }

    /**
     * 创建人
     * @param createPerson 创建人
     */
    public void setCreatePerson(Object createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Object getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Object createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新人
     * @return update_person 更新人
     */
    public Object getUpdatePerson() {
        return updatePerson;
    }

    /**
     * 更新人
     * @param updatePerson 更新人
     */
    public void setUpdatePerson(Object updatePerson) {
        this.updatePerson = updatePerson;
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Object getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Object updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sysCode=").append(sysCode);
        sb.append(", resourceName=").append(resourceName);
        sb.append(", resourceCode=").append(resourceCode);
        sb.append(", resourceUrl=").append(resourceUrl);
        sb.append(", permission=").append(permission);
        sb.append(", isLocked=").append(isLocked);
        sb.append(", routerId=").append(routerId);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", createTime=").append(createTime);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}