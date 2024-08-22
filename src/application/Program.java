package application;

import model.dao.SellerDao;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.entities.Seller;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao(); // Dependence injection without show the implementation

		System.out.println("------------------- teste 1 FindByID----------------------");
		Seller seller = sellerDao.findById(1);
		System.out.println(seller);
		System.out.println("--------------------------------------------------");

		System.out.println("------------------- teste 2 FindByDepartment----------------------");

		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);

		}

		System.out.println("--------------------------------------------------");

		System.out.println("------------------- teste 3 FindAll----------------------");

		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("--------------------------------------------------");
		
		System.out.println("------------------- teste 4 seller insert----------------------");
		
		Seller newSeller = new Seller(9, "Greg", "greg@gmail.com", new Date(), 4000, department);
		sellerDao.insert(newSeller);
		System.out.println("inserted new id = " + newSeller.getId());
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("------------------- teste 4 seller insert----------------------");
		
		seller = sellerDao.findById(1);
		seller.setName("Marta");
		sellerDao.update(seller);

		System.out.println("--------------------------------------------------");
	}

}
