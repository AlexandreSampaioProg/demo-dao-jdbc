package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		
		DepartmentDao departDao = DaoFactory.createDepartmentDao();
		
		Department newdepartment = new Department(1, "viajem");
		departDao.insert(newdepartment);
		System.out.println("Novo departamento: " + newdepartment.getId()+ " Nome:" +newdepartment.getName());
	}
}
