/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Project;

/**
 *
 * @author ACER
 */
public interface ProjectDAO {
    public List<Project> getList();
    
    public int createOrUpdate(Project project);
}
