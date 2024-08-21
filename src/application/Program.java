package application;

import model.dao.SellerDao;

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

		System.out.println("------------------- teste 3 FindByDepartment----------------------");

		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("--------------------------------------------------");
	}

}
