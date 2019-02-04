package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entitites.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();  
		
		System.out.println("=== Teste 1: Department findById ===");
		Department department = departmentDao.findById(2);
		System.out.println(department);


		System.out.println("\n=== Teste 2: Department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== Teste 3: new Department  ===");
		Department newDepartment = new Department(null, "BBB");
		departmentDao.insert(newDepartment);
		System.out.println(newDepartment);

		System.out.println("\n=== Teste 4: Department update  ===");
		System.out.println("antes....");
		System.out.println(department);
		department = departmentDao.findById(1);
		department.setName("Maroca");
		departmentDao.update(department);
		System.out.println("....depois");
		System.out.println(department);
	
		System.out.println("\n=== Teste 5: seller delete  ===");
		System.out.println("Entre Id:");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Department Deleted");
		sc.close();
	}

}
