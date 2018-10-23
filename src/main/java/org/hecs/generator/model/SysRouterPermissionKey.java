package org.hecs.generator.model;

public class SysRouterPermissionKey {
    /**
     * 
     */
    private Object roleId;

    /**
     * 
     */
    private Object routerId;

    /**
     * 
     * @return role_id 
     */
    public Object getRoleId() {
        return roleId;
    }

    /**
     * 
     * @param roleId 
     */
    public void setRoleId(Object roleId) {
        this.roleId = roleId;
    }

    /**
     * 
     * @return router_id 
     */
    public Object getRouterId() {
        return routerId;
    }

    /**
     * 
     * @param routerId 
     */
    public void setRouterId(Object routerId) {
        this.routerId = routerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", routerId=").append(routerId);
        sb.append("]");
        return sb.toString();
    }
}