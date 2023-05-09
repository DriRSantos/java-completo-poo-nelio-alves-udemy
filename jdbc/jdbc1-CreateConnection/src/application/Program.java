package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		// call conn when want to make connection
		Connection conn = DB.getConnection();
		DB.closeConnecttion(); 

	}

}
