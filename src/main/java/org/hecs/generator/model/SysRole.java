package org.hecs.generator.model;

public class SysRole {
    /**
     * 角色ID
     */
    private Object id;

    /**
     * 系统编码
     */
    private Object sysCode;

    /**
     * 角色编码
     */
    private Object roleCode;

    /**
     * 角色名称
     */
    private Object roleName;

    /**
     * 禁用标识 0启用 1禁用
     */
    private Object isLocked;

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
     * 角色ID
     * @return id 角色ID
     */
    public Object getId() {
        return id;
    }

    /**
     * 角色ID
     * @param id 角色ID
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
     * 角色编码
     * @return role_code 角色编码
     */
    public Object getRoleCode() {
        return roleCode;
    }

    /**
     * 角色编码
     * @param roleCode 角色编码
     */
    public void setRoleCode(Object roleCode) {
        this.roleCode = roleCode;
    }

    /**
     * 角色名称
     * @return role_name 角色名称
     */
    public Object getRoleName() {
        return roleName;
    }

    /**
     * 角色名称
     * @param roleName 角色名称
     */
    public void setRoleName(Object roleName) {
        this.roleName = roleName;
    }

    /**
     * 禁用标识 0启用 1禁用
     * @return is_locked 禁用标识 0启用 1禁用
     */
    public Object getIsLocked() {
        return isLocked;
    }

    /**
     * 禁用标识 0启用 1禁用
     * @param isLocked 禁用标识 0启用 1禁用
     */
    public void setIsLocked(Object isLocked) {
        this.isLocked = isLocked;
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
        sb.append(", roleCode=").append(roleCode);
        sb.append(", roleName=").append(roleName);
        sb.append(", isLocked=").append(isLocked);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", createTime=").append(createTime);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}