package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		// connect to database, prepare sql query and save result
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
			
		// try because can occur exception
		try {
			conn = DB.getConnection();
			
			
			// create Statement for SQL command
			st = conn.createStatement();
			
			// executeQuery Method, parameters String that contains an SQL statement
			rs = st.executeQuery("select * from department");
			
			// iterate through rs to obtain Int id and String name
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally { // external resources should be closed manually
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnecttion();
			
		}
		
	}
}
