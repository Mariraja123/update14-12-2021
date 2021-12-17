package CarbookingDAO;
import Carbooking.*;
import java.sql.Connection;
import Carbookingconnection.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import car.Carproduct;
import car.Connectionutil;
import Carbookingconnection.*;
public class CarproductDAO {

	public  List<Carproduct> showview() throws SQLException, ClassNotFoundException {
		List<Carproduct> listOfProducts = new ArrayList<>();
//		
		String query = "select * from product_details";
		Connectionutil conect = new Connectionutil();
		Connection con = Connectionutil.getDBconnection();
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {

			System.out.format("%-5s%-27s%-6s%-10s%-5s%-8s%-7s%-9s","product_id=",rs.getString(1),"product_name=", rs.getDouble(2),"description",
																			rs.getString(3),"cartype-",rs.getString(4));
			System.out.println();
		}

		return listOfProducts;
     }
//     public static void update(Carproduct obj1) throws ClassNotFoundException, SQLException
//     {
//   	  String update="update product_details set Description=? where product_id=? ";
//   	  Connection Con=Connectionutil.getDBconnection();
//   	  PreparedStatement stmt=Con.prepareStatement(update);
//   	  stmt.setString(1, obj1.getDescription());
//   	  stmt.setString(2, obj1.getProduct_id());
//   	  int i=stmt.executeUpdate();
//   	  System.out.println(i);
//     }


}
