package customerdetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class CustomerDAO {

	public static void insert(Customerdetail obj) throws ClassNotFoundException, SQLException
    {
	String insert="insert into customer_detail values(?,?,?,?,?,?)";
	Connection Con=Connectionutil.getDBconnection();
	PreparedStatement stmt=Con.prepareStatement(insert);
	stmt.setString(1, obj.getCustomer_id());
	stmt.setString(2, obj.getLogin_id());
	stmt.setString(3, obj.getCustomer_name());
	stmt.setLong(4, obj.getPhone());
	stmt.setString(5, obj.getEmail());
	stmt.setString(6, obj.getAddress());
	
	int i=stmt.executeUpdate();
	System.out.println(i);
    }
    public static void update(Customerdetail obj1) throws ClassNotFoundException, SQLException
    {
  	  String update="update price_detail set phone=? where customer_id=? ";
  	  Connection Con=Connectionutil.getDBconnection();
  	  PreparedStatement stmt=Con.prepareStatement(update);
  	  stmt.setLong(1, obj1.getPhone());
  	  stmt.setString(2, obj1.getCustomer_id());
  	  int i=stmt.executeUpdate();
  	  System.out.println(i);
    }
}
