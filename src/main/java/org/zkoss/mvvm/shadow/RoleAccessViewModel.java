package org.zkoss.mvvm.shadow;

import org.zkoss.bind.annotation.DependsOn;

public class RoleAccessViewModel {

    private Role role = Role.USER;

    @DependsOn("role")
    public boolean isAdmin(){
        // implement your complicated logic to determine an admin access
        return role.equals(Role.ADMIN);
    }

    public Role[] getRoleList(){
        return Role.values();
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
