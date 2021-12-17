package car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CarproductDAO {
	  public static void insert(Carproduct obj) throws ClassNotFoundException, SQLException
      {
	String insert="insert into product_details values(?,?,?,?,?)";
	Connection Con=Connectionutil.getDBconnection();
	PreparedStatement stmt=Con.prepareStatement(insert);

	stmt.setString(1, obj.getProduct_id());
	stmt.setString(2, obj.getProduct_name());
	stmt.setString(3, obj.getDescription());
	
	stmt.setString(4, obj.getFueltype());
	stmt.setString(5, obj.getCartype());
	int i=stmt.executeUpdate();
	System.out.println(i);
      }
      public static void update(Carproduct obj1) throws ClassNotFoundException, SQLException
      {
    	  String update="update product_details set Description=? where product_id=? ";
    	  Connection Con=Connectionutil.getDBconnection();
    	  PreparedStatement stmt=Con.prepareStatement(update);
    	  stmt.setString(1, obj1.getDescription());
    	  stmt.setString(2, obj1.getProduct_id());
    	  int i=stmt.executeUpdate();
    	  System.out.println(i);
      }


}
