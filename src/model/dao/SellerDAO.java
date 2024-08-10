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
public interface SellerDAO {
    
     void insert(SellerDAO obj);
    void update(SellerDAO obj);
    void deleteById(int id);
    SellerDAO findById(int id);
    List<SellerDAO> findAll();
    
}
