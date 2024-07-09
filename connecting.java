package BillGenerator;

import java.sql.*;

public class connecting {
	
	
	
	public void updateorder(Pizza pizza) throws SQLException {
		String query="insert into pizza values (?,?,?)";
		Connection con=conection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, (int) Math.incrementExact(1));
		pst.setString(2,pizza.Pizzza);
		pst.setInt(3,pizza.price);
		pst.executeUpdate();
		
	}
	
	
//	
//	public void displayinfo () throws SQLException {
//		String query="select*from pizza";
//		Connection con=conection.getConnection();
//		Statement st=con.createStatement();
//		ResultSet rs=st.executeQuery(query);
//		
//		rs.next();
//		System.out.println("order number "+rs.getInt(1));
//		System.out.println("pizza name  "+rs.getString(2));
//		System.out.println("price  "+rs.getInt(3));
//		
//		
		
		
	//}



	
}
