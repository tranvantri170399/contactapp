/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import DAO.ProjectDAO;
import DAO.ProjectDAOiml;
import java.util.List;
import model.Project;

/**
 *
 * @author ACER
 */
public class DuAnServiceiml implements DuAnService{
    
    private ProjectDAO projectdao = null;
    
    public DuAnServiceiml(){
        projectdao= new ProjectDAOiml();
    }
    
    @Override
    public List<Project> getList() {
       return projectdao.getList();
       
    }

    @Override
    public int createOrUpdate(Project project) {
        return projectdao.createOrUpdate(project);
    }
    
}
