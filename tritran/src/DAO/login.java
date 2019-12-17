/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.loginDTO;

/**
 *
 * @author ACER
 */
public interface login {
    public List<loginDTO> getList();
    
    public int createOrUpdate(loginDTO logindto);
}
