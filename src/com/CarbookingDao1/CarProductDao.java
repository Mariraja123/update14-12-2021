package com.CarbookingDao1;

import java.util.List;

import com.Carbookingpojo.CarProduct;

public interface CarProductDao {
	public   List<CarProduct> showview();
	public  void update(CarProduct obj1);
	  public  void insert(CarProduct obj1);
	   public  void delete(CarProduct obj1);
	   public  String Searchproduct(CarProduct obj3);
	   public  CarProduct selectproduct(CarProduct obj);
	  

}
