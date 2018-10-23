package org.hecs.generator.model;

public class SysRouterPermission extends SysRouterPermissionKey {
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
        sb.append(", createPerson=").append(createPerson);
        sb.append(", createTime=").append(createTime);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}