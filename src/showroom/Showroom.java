package showroom;

public class Showroom {
	
	private  String showroom_id;
	 private String location;
	 private String branch;
	public Showroom(String showroom_id, String location) {
		super();
		this.showroom_id = showroom_id;
		this.location = location;
	}
	private int phone;
	 private String address;
	public Showroom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getShowroom_id() {
		return showroom_id;
	}
	public void setShowroom_id(String showroom_id) {
		this.showroom_id = showroom_id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Showroom(String showroom_id, String location, String branch, int phone, String address) {
		super();
		this.showroom_id = showroom_id;
		this.location = location;
		this.branch = branch;
		this.phone = phone;
		this.address = address;
	}
}
