/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.dao;

import java.util.List;
import model.entities.Department;
/**
 *
 * @author alexandre
 */
public interface DepartmentDao {
    
    void insert(Department obj);
    void update(Department obj);
    void deleteById(int id);
    Department findById(int id);
    List<Department> findAll();
    
}
