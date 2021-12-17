package Carbooking;

public class Carproduct {

	 private String product_id;
	 private String product_name;
	 private String description;

	 private String fueltype;
	 private String cartype;
	public Carproduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Carproduct(String product_id, String product_name, String description, String fueltype, String cartype) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.description = description;
		this.fueltype = fueltype;
		this.cartype = cartype;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
}
