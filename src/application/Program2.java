package application;

import java.util.List;
import java.util.Scanner;


import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departDao = DaoFactory.createDepartmentDao();
		
		Department newdepartment = new Department(1, "viajem");
		departDao.insert(newdepartment);
		System.out.println("Novo departamento: " + newdepartment.getId()+ " Nome:" +newdepartment.getName());
		
		System.out.println("\n=== TEST 2: delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departDao.deleteById(id);
		System.out.println("Delete completed");		


		System.out.println("\n=== TEST 3: update =======");
		Department dep2 = departDao.findById(1);
		dep2.setName("Food");
		departDao.update(dep2);
		System.out.println("Update completed");
		
		System.out.println("=== TEST 1: findById =======");
		Department dep = departDao.findById(1);
		System.out.println(dep);

		
		System.out.println("\n=== TEST 4: findAll =======");
		List<Department> list = departDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}

		sc.close();
	}
}
