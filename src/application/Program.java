package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitites.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();  
		
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);

	}

}
