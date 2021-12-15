package productPrice;

public class Productprice {
 private  String price_id;
 private String product_id;
 private String product_name;
 private String Showroomprice;
 private int onroadprice;
 private String roadtax;
 private int insurance;
public Productprice(String product_id, String showroomprice) {
	super();
	this.product_id = product_id;
	Showroomprice = showroomprice;
}
public String getPrice_id() {
	return price_id;
}
public void setPrice_id(String price_id) {
	this.price_id = price_id;
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
public String getShowroomprice() {
	return Showroomprice;
}
public void setShowroomprice(String showroomprice) {
	Showroomprice = showroomprice;
}
public int getOnroadprice() {
	return onroadprice;
}
public void setOnroadprice(int onroadprice) {
	this.onroadprice = onroadprice;
}
public String getRoadtax() {
	return roadtax;
}
public void setRoadtax(String roadtax) {
	this.roadtax = roadtax;
}
public int getInsurance() {
	return insurance;
}
public void setInsurance(int insurance) {
	this.insurance = insurance;
}
public Productprice() {
	super();
	// TODO Auto-generated constructor stub
}
public Productprice(String price_id, String product_id, String product_name, String showroomprice, int onroadprice,
		String roadtax, int insurance) {
	super();
	this.price_id = price_id;
	this.product_id = product_id;
	this.product_name = product_name;
	Showroomprice = showroomprice;
	this.onroadprice = onroadprice;
	this.roadtax = roadtax;
	this.insurance = insurance;
}
}
