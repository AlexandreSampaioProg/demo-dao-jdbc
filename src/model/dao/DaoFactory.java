/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import model.dao.impl.SellerDAOJdbc;



/**
 *
 * @author alexandre
 */
public class DaoFactory {
    public static SellerDAO createSellerDAO(){
        return new SellerDAOJdbc();
    } 
}
