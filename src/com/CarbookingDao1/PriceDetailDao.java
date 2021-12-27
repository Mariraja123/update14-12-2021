package com.CarbookingDao1;

import com.Carbookingpojo.Pricedetail;

public interface PriceDetailDao {

	public  void insert(Pricedetail obj);
	 public  void update(Pricedetail obj1);
	 public  void delete (Pricedetail obj);
	 public  int Findproduct(String obj);
	 
}
