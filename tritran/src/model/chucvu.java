/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ACER
 */
public class chucvu {
    private int RoleID;
    private String RoleName;
    private int RoleAllowance;

    public chucvu() {
    }

    public chucvu(int RoleID, String RoleName, int RoleAllowance) {
        this.RoleID = RoleID;
        this.RoleName = RoleName;
        this.RoleAllowance = RoleAllowance;
    }

    public int getRoleID() {
        return RoleID;
    }

    public void setRoleID(int RoleID) {
        this.RoleID = RoleID;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    public int getRoleAllowance() {
        return RoleAllowance;
    }

    public void setRoleAllowance(int RoleAllowance) {
        this.RoleAllowance = RoleAllowance;
    }

    
    
}
