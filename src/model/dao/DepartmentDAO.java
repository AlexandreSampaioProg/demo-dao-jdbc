/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.dao;

import java.util.List;

/**
 *
 * @author alexandre
 */
public interface DepartmentDAO {
    
    void insert(DepartmentDAO obj);
    void update(DepartmentDAO obj);
    void deleteById(int id);
    DepartmentDAO findById(int id);
    List<DepartmentDAO> findAll();
    
}
