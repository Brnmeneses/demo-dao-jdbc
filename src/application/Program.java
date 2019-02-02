package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitites.Department;
import model.entitites.Seller;

public class Program {

	public static void main(String[] args) {

		Department dep = new Department(1,"TI");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, dep);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();  
		
		System.out.println(seller);

	}

}
