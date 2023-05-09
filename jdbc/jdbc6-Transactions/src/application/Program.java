package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;

		try {
			conn = DB.getConnection();
			
//			 false to force confirmation of the transaction, to execute all the code
			conn.setAutoCommit(false); 
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2570 WHERE DepartmentId = 3");
			
//			simulate fake exception when not using AutoCommit false
//			int x = 1;
//			if(x < 2) {
//				throw new SQLException("Fake error");
//			}
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3890 WHERE DepartmentId = 2");
			
//			to confirm transaction and execute all the code
			conn.commit();
			
			System.out.println("rows1 " + rows1);
			System.out.println("rows2 " + rows2);
			
		}
		catch (SQLException e){
			try {
//				return transaction if stopped in the middle
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) { // exception when trying to rollback
				throw new DbException("Error trying to rollback! Caused by " + e1.getMessage());
			}
		}	
		finally {
			DB.closeStatement(st);
			DB.closeConnecttion();
		}
	}
}
