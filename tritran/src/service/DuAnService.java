/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Project;

/**
 *
 * @author ACER
 */
public interface DuAnService {
    public List<Project> getList();
    public int createOrUpdate(Project project);
}
