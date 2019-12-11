/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class PhongBan {
    private int DepartmentID;
    private String DepartmentName;
    private int NumOfEmployee;

    public PhongBan() {
    }

    public PhongBan(int DepartmentID, String DepartmentName, int NumOfEmployee) {
        this.DepartmentID = DepartmentID;
        this.DepartmentName = DepartmentName;
        this.NumOfEmployee = NumOfEmployee;
    }

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(int DepartmentID) {
        this.DepartmentID = DepartmentID;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    public int getNumOfEmployee() {
        return NumOfEmployee;
    }

    public void setNumOfEmployee(int NumOfEmployee) {
        this.NumOfEmployee = NumOfEmployee;
    }
    
    
}
