/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class Image {
    private int imageID;
    private int EmployeeID;
    private byte[] image;
    private boolean gioitinh;
    private Date ngaysinh;

    public Image() {
    }

    public Image(int imageID, int EmployeeID, byte[] image, boolean gioitinh, Date ngaysinh) {
        this.imageID = imageID;
        this.EmployeeID = EmployeeID;
        this.image = image;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    
    
}
