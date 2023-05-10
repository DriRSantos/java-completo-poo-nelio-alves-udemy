package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		// instantiate SellerDao using DaoFactory, no need to make the implementation explicit
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById =====");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);		
		
	}
}
