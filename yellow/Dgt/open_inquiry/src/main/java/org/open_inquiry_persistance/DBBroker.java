package org.open_inquiry_persistance;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBBroker {
	private static DBBroker instance = null;
	private static Connection connection = null;
	public static String Path = "jdbc:mysql://localhost:3306/multas?autoReconnect=true&useSSL=false";

	public DBBroker() throws SQLException, Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(Path,"root","root");
	}
	
	public static DBBroker getInstance() throws SQLException, Exception{
			instance = new DBBroker();
			return instance;
	}

	public ResultSet read(String query)  throws SQLException{
		 Statement cmd = connection.createStatement();
		ResultSet rs = cmd.executeQuery(query);
		return rs;
	}
	public int update(String query) throws SQLException{
		Statement statement = connection.createStatement();
		int update_done = statement.executeUpdate(query);
		return update_done;
	}

	public int insert(String query) throws SQLException{
		Statement statement = connection.createStatement();
		int insert_done = statement.executeUpdate(query);
		return insert_done;
	}

	public int delete(String query) throws SQLException{
		Statement statement = connection.createStatement();
		int delete_done = statement.executeUpdate(query);
		return delete_done;
	}

}