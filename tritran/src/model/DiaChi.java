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
public class DiaChi {
    private int LocationID;
    private String LocationName;
    private float LocationAllowance;
    private int NumOfEmployee;

    public DiaChi() {
    }

    public DiaChi(int LocationID, String LocationName, float LocationAllowance, int NumOfEmployee) {
        this.LocationID = LocationID;
        this.LocationName = LocationName;
        this.LocationAllowance = LocationAllowance;
        this.NumOfEmployee = NumOfEmployee;
    }

    public int getLocationID() {
        return LocationID;
    }

    public void setLocationID(int LocationID) {
        this.LocationID = LocationID;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String LocationName) {
        this.LocationName = LocationName;
    }

    public float getLocationAllowance() {
        return LocationAllowance;
    }

    public void setLocationAllowance(float LocationAllowance) {
        this.LocationAllowance = LocationAllowance;
    }

    public int getNumOfEmployee() {
        return NumOfEmployee;
    }

    public void setNumOfEmployee(int NumOfEmployee) {
        this.NumOfEmployee = NumOfEmployee;
    }
    
    
    
}
