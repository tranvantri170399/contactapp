/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import helper.jdbcHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Project;

/**
 *
 * @author ACER
 */
public class ProjectDAOiml implements ProjectDAO{


    @Override
    public List<Project> getList() {
         try{
        Connection cons = jdbcHelper.getConnection();
        String sql ="SELECT dbo.Projects.ProjectID, dbo.Projects.ProjectName, COUNT(dbo.Employees.EmployeeID) AS NumOfEmployee FROM dbo.Projects, dbo.Employees \n" +
"WHERE dbo.Projects.ProjectID = dbo.Employees.ProjectID\n" +
" GROUP BY dbo.Projects.ProjectID, dbo.Projects.ProjectName  UNION SELECT dbo.Projects.ProjectID, dbo.Projects.ProjectName,0 AS NumOfEmployee\n" +
"  FROM dbo.Projects,dbo.Employees\n" +
"  WHERE dbo.Projects.ProjectID not in(select dbo.Employees.ProjectID from dbo.Employees )\n" +
"  GROUP BY dbo.Projects.ProjectID, dbo.Projects.ProjectName";
        List <Project> list = new ArrayList<>();
        PreparedStatement ps = cons.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Project nv = new Project();
            nv.setProjectID(rs.getInt("ProjectID"));
            nv.setProjectName(rs.getString("ProjectName"));
            nv.setNumOfEmployee(rs.getInt("NumOfEmployee"));
            list.add(nv);
        }
        ps.close();
        rs.close();
        return list;
    }catch(Exception e){
        e.printStackTrace();
    }
        return null;
    }

    @Override
    public int createOrUpdate(Project project) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
     public static void main(String[] args) {
        ProjectDAO ProjectDAO = new ProjectDAOiml();
        System.out.println(ProjectDAO.getList());
    }
    
}
