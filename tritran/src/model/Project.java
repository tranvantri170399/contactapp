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
public class Project {
     private int ProjectID;
     private String ProjectName;
     private int NumOfEmployee;

    public Project() {
    }

    public Project(int ProjectID, String ProjectName, int NumOfEmployee) {
        this.ProjectID = ProjectID;
        this.ProjectName = ProjectName;
        this.NumOfEmployee = NumOfEmployee;
    }

    public int getProjectID() {
        return ProjectID;
    }

    public void setProjectID(int ProjectID) {
        this.ProjectID = ProjectID;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public int getNumOfEmployee() {
        return NumOfEmployee;
    }

    public void setNumOfEmployee(int NumOfEmployee) {
        this.NumOfEmployee = NumOfEmployee;
    }
     
     
}
