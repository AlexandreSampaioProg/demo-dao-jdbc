package application;

import java.util.Date;
import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Departament;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {
        Departament obj = new Departament (1, "Books");
        
        
        Seller seller = new Seller(1, "juao", "asas", new Date(), 1000, obj);
        
        SellerDAO sellerDAO = DaoFactory.createSellerDAO(); //Dependence injection without show the implementation
        
        System.out.println(obj);
        System.out.println(seller);
       
        
    }
}
