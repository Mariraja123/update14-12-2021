package registerd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class RegisteredDAO {

	 public static void insert(Registered obj) throws ClassNotFoundException, SQLException
     {
	String insert="insert into registered values(?,?,?,?,?,?)";
	Connection Con=Connectionutil.getDBconnection();
	PreparedStatement stmt=Con.prepareStatement(insert);
	stmt.setString(1, obj.getFirst_name());
	stmt.setString(2, obj.getLast_name());
	stmt.setLong(3, obj.getPhone());
	stmt.setString(4, obj.getEmail());
	stmt.setString(5, obj.getPassword());
	stmt.setString(6, obj.getCpassword());
	
	int i=stmt.executeUpdate();
	System.out.println(i+"registered sucessfully");
     }
//     public static void update(Productprice obj1) throws ClassNotFoundException, SQLException
//     {
//   	  String update="update registered set showroomprice=? where product_id=? ";
//   	  Connection Con=Connectionutil.getDBconnection();
//   	  PreparedStatement stmt=Con.prepareStatement(update);
//   	  stmt.setString(1, obj1.getShowroomprice());
//   	  stmt.setString(2, obj1.getProduct_id());
//   	  int i=stmt.executeUpdate();
//   	  System.out.println(i);
//     }
	 public boolean fetch(String uname,String pass) throws ClassNotFoundException, SQLException {
			
			String query="select firstname,cpassword from registered where firstname in ? and cpassword in ?";
			Connection con=Connectionutil.getDBconnection();
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, uname);
			pstmt.setString(2, pass);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				return true;
			}
			
			return false;
			
			
		}
}
