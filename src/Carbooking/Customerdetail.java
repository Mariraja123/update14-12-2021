package Carbooking;

import java.sql.Date;

public class Customerdetail {
	private  String customer_id;
	private String city;
	private String customer_name;
	private int user_id;
	private Date expecteddate;
	private String address;
	public Customerdetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customerdetail(String customer_id, String city, String customer_name, int user_id, Date expecteddate,
			String address) {
		super();
		this.customer_id = customer_id;
		this.city = city;
		this.customer_name = customer_name;
		this.user_id = user_id;
		this.expecteddate = expecteddate;
		this.address = address;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getExpecteddate() {
		return expecteddate;
	}
	public void setExpecteddate(Date expecteddate) {
		this.expecteddate = expecteddate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
