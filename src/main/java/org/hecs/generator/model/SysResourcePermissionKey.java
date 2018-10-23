package org.hecs.generator.model;

public class SysResourcePermissionKey {
    /**
     * 角色ID
     */
    private Object roleId;

    /**
     * 资源ID
     */
    private Object resourceId;

    /**
     * 角色ID
     * @return role_id 角色ID
     */
    public Object getRoleId() {
        return roleId;
    }

    /**
     * 角色ID
     * @param roleId 角色ID
     */
    public void setRoleId(Object roleId) {
        this.roleId = roleId;
    }

    /**
     * 资源ID
     * @return resource_id 资源ID
     */
    public Object getResourceId() {
        return resourceId;
    }

    /**
     * 资源ID
     * @param resourceId 资源ID
     */
    public void setResourceId(Object resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", resourceId=").append(resourceId);
        sb.append("]");
        return sb.toString();
    }
}