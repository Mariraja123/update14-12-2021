package car;

import java.util.Objects;

public class Carproduct {

	 private String product_id;
	 private String product_name;
	 private String description;
	 @Override
	public String toString() {
		return "Carproduct [product_id=" + product_id + ", product_name=" + product_name + ", description="
				+ description + ", fueltype=" + fueltype + ", cartype=" + cartype + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cartype, description, fueltype, product_id, product_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carproduct other = (Carproduct) obj;
		return Objects.equals(cartype, other.cartype) && Objects.equals(description, other.description)
				&& Objects.equals(fueltype, other.fueltype) && Objects.equals(product_id, other.product_id)
				&& Objects.equals(product_name, other.product_name);
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
	private String fueltype;
	 private String cartype;
}
