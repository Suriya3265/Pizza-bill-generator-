package BillGenerator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conection {
	
	private static final String url="jdbc:mysql://localhost:3306/pizza_orders";
    private static final String user="root";
 	private static final String password="lion";
	
    public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,user,password);
		
		

	}
	

}
