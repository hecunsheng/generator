package org.hecs.generator.model;

public class SysUserRoleKey {
    /**
     * 用户ID
     */
    private Object userId;

    /**
     * 角色ID
     */
    private Object roleId;

    /**
     * 用户ID
     * @return user_id 用户ID
     */
    public Object getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId 用户ID
     */
    public void setUserId(Object userId) {
        this.userId = userId;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append("]");
        return sb.toString();
    }
}