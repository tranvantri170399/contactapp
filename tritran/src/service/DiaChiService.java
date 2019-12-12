/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.DiaChi;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public interface DiaChiService {
    public List<DiaChi> getList();
    public int createOrUpdate(DiaChi diaChi);
}
