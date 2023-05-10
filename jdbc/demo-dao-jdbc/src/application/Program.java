package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
//		Department obj = new Department(1, "Books");
//		System.out.println(obj);
//		
//		Seller sel = new Seller(1, "Adriana", "dri@email.com", new Date(), 2500.0, obj);
//		System.out.println(sel);
		
		// instantiate SellerDao using DaoFactory, no need to make the implementation explicit
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);		
		
	}
}
