package gmailproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbtests {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeportal","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from userdetails");
		while(rs.next())
		{
			System.out.println(rs.getString("email"));
		}
		System.out.println("------");
		String istr="Insert into userdetails (email, password) values (?, ?)";
		
		//Statement is used to run the static queries
		//PreparedStatement is used to run the parameterized queries.
				
		PreparedStatement pst=con.prepareStatement(istr);
		pst.setString(1,"sumanth.nerella2@gmail.com");
		pst.setString(2, "sdfs");
		pst.executeUpdate();
		
		String ustr="Update userdetails set email=? where email=?";
		pst=con.prepareStatement(ustr);
		pst.setString(1, "sumanth.nerella@gmail.com");
		pst.setString(2, "sumanth.nerella2@gmail.com");
		pst.executeUpdate();
		
		
		rs=st.executeQuery("select * from userdetails");
		
		while(rs.next())
		{
			System.out.println(rs.getString("email"));
			System.out.println(rs.getString("password"));
		}
		
		st.close();
		pst.close();
		con.close();
	}

}
