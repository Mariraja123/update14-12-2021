package productPrice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class PriceDAO {
	
	 public static void insert(Productprice obj) throws ClassNotFoundException, SQLException
     {
	String insert="insert into price_details values(?,?,?,?,?,?,?)";
	Connection Con=Connectionutil.getDBconnection();
	PreparedStatement stmt=Con.prepareStatement(insert);
	stmt.setString(1, obj.getPrice_amount());
	stmt.setString(2, obj.getProduct_id());
	stmt.setString(3, obj.getProduct_name());
	stmt.setString(4, obj.getShowroomprice());
	stmt.setInt(5, obj.getOnroadprice());
	stmt.setString(6, obj.getRoadtax());
	stmt.setInt(7, obj.getInsurance());
	int i=stmt.executeUpdate();
	System.out.println(i);
     }
     public static void update(Productprice obj1) throws ClassNotFoundException, SQLException
     {
   	  String update="update price_detail set showroomprice=? where product_id=? ";
   	  Connection Con=Connectionutil.getDBconnection();
   	  PreparedStatement stmt=Con.prepareStatement(update);
   	  stmt.setString(1, obj1.getShowroomprice());
   	  stmt.setString(2, obj1.getProduct_id());
   	  int i=stmt.executeUpdate();
   	  System.out.println(i);
     }
	

}
