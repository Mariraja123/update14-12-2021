package car;

public class Userdetail {
	private int user_id;
	private String first_name;
	private String cpassword;
	private String roletype;
	private String Email;
	public Userdetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getRoletype() {
		return roletype;
	}
	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}
	public String getEmail() {
		return Email;
	}
	public Userdetail(String cpassword, String email) {
		
		this.cpassword = cpassword;
		this.Email = email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public Userdetail(int user_id, String first_name, String cpassword, String roletype, String email) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.cpassword = cpassword;
		this.roletype = roletype;
		this.Email = email;
	}
	

}
