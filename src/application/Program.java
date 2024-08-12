package application;

import model.dao.SellerDao;
import model.dao.DaoFactory;
import model.entities.Seller;


public class Program {

    public static void main(String[] args) {
         
        SellerDao sellerDao = DaoFactory.createSellerDao(); //Dependence injection without show the implementation
        
        Seller seller = sellerDao.findById(3);
        
        System.out.println(seller);
       
        
    }
}
