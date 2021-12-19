package CarbookingDAO;

import java.sql.Connection;
import Carbookingconnection.*;
import Carbooking.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class PricedetailDAO {
	public static void insert(Pricedetail obj) throws ClassNotFoundException, SQLException
    {
	String insert="insert into price_details values(?,?,?,?,?,?)";
	Connection Con=Connectionutil.getDBconnection();
	PreparedStatement stmt=Con.prepareStatement(insert);
	stmt.setString(1, obj.getCar_id());
	stmt.setString(2, obj.getCar_name());
	stmt.setString(3, obj.getExshowroomprice());
	stmt.setString(4, obj.getRoadtax());
	stmt.setInt(5, obj.getOnroadprice());
	stmt.setInt(6, obj.getInsurance());
	int i=stmt.executeUpdate();
	System.out.println(i);
    }
    public static void update(Pricedetail obj1) throws ClassNotFoundException, SQLException
    {
  	  String update="update price_details set showroomprice=? where car_id=? ";
  	  Connection Con=Connectionutil.getDBconnection();
  	  PreparedStatement stmt=Con.prepareStatement(update);
       stmt.setString(1, obj1.getExshowroomprice());
        stmt.setString(2, obj1.getCar_id());
  	  int i=stmt.executeUpdate();
  	  System.out.println(i);
    }
	

}
