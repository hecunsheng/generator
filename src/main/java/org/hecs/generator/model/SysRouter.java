package org.hecs.generator.model;

public class SysRouter {
    /**
     * 路由ID
     */
    private Object id;

    /**
     * 系统编码
     */
    private Object sysCode;

    /**
     * 路由编码
     */
    private Object routerCode;

    /**
     * 路由名称
     */
    private Object routerName;

    /**
     * 路由url
     */
    private Object routerUrl;

    /**
     * 父节点ID
     */
    private Object parentId;

    /**
     * 子级节点
     */
    private Object level;

    /**
     * 是否禁用 0启用 1禁用
     */
    private Object isLocked;

    /**
     * 显示顺序
     */
    private Object displayOrder;

    /**
     * 配置项
     */
    private Object properties;

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
     * 路由ID
     * @return id 路由ID
     */
    public Object getId() {
        return id;
    }

    /**
     * 路由ID
     * @param id 路由ID
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
     * 路由编码
     * @return router_code 路由编码
     */
    public Object getRouterCode() {
        return routerCode;
    }

    /**
     * 路由编码
     * @param routerCode 路由编码
     */
    public void setRouterCode(Object routerCode) {
        this.routerCode = routerCode;
    }

    /**
     * 路由名称
     * @return router_name 路由名称
     */
    public Object getRouterName() {
        return routerName;
    }

    /**
     * 路由名称
     * @param routerName 路由名称
     */
    public void setRouterName(Object routerName) {
        this.routerName = routerName;
    }

    /**
     * 路由url
     * @return router_url 路由url
     */
    public Object getRouterUrl() {
        return routerUrl;
    }

    /**
     * 路由url
     * @param routerUrl 路由url
     */
    public void setRouterUrl(Object routerUrl) {
        this.routerUrl = routerUrl;
    }

    /**
     * 父节点ID
     * @return parent_id 父节点ID
     */
    public Object getParentId() {
        return parentId;
    }

    /**
     * 父节点ID
     * @param parentId 父节点ID
     */
    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    /**
     * 子级节点
     * @return level 子级节点
     */
    public Object getLevel() {
        return level;
    }

    /**
     * 子级节点
     * @param level 子级节点
     */
    public void setLevel(Object level) {
        this.level = level;
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
     * 显示顺序
     * @return display_order 显示顺序
     */
    public Object getDisplayOrder() {
        return displayOrder;
    }

    /**
     * 显示顺序
     * @param displayOrder 显示顺序
     */
    public void setDisplayOrder(Object displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * 配置项
     * @return properties 配置项
     */
    public Object getProperties() {
        return properties;
    }

    /**
     * 配置项
     * @param properties 配置项
     */
    public void setProperties(Object properties) {
        this.properties = properties;
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
        sb.append(", routerCode=").append(routerCode);
        sb.append(", routerName=").append(routerName);
        sb.append(", routerUrl=").append(routerUrl);
        sb.append(", parentId=").append(parentId);
        sb.append(", level=").append(level);
        sb.append(", isLocked=").append(isLocked);
        sb.append(", displayOrder=").append(displayOrder);
        sb.append(", properties=").append(properties);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", createTime=").append(createTime);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}