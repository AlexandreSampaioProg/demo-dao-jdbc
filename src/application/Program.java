package application;

import java.util.Date;
import model.entities.Departament;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {
        Departament obj = new Departament (1, "Books");
        
        
        Seller seller = new Seller(1, "juao", "asas", new Date(), 1000, obj);
            
        System.out.println(obj);
        System.out.println(seller);
        
    }
}
