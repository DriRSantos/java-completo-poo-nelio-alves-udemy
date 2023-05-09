package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
	
	private static Connection conn = null;
	
	// method to make connection
	public static Connection getConnection() {
		if(conn == null) {
			try{
				Properties props = loadProperies();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);
			}
			catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return conn;
	}
	
	public static void closeConnecttion() {
		if(conn != null) {
			try {
				conn.close();
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}	
	
	// static method to load db.properties
	private static Properties loadProperies() {
		try(FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;
		} 
		catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
}
