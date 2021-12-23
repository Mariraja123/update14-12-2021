package com.Carbookingpojo;

import java.util.Objects;

public class Userdetail {
	private int userId;
	private String first_name;
	private String cpassword;
	private String Email;
	private Long phoneno;
    private String usertype;

	public Userdetail(String first_name, String cpassword, String email, Long phoneno) {
		super();
		this.first_name = first_name;
		this.cpassword = cpassword;
		this.Email = email;
		this.phoneno = phoneno;
	}

	public Userdetail(int userId, String cpassword) {
		super();
		this.userId = userId;
		this.cpassword = cpassword;
	}

	public Userdetail(int userId) {
		super();
		this.userId = userId;
	}
	public Userdetail(String cpassword, String email) {
		super();
		this.cpassword = cpassword;
		this.Email = email;
	}
	@Override
	public String toString() {
		return "Userdetail [userId=" + userId + ", first_name=" + first_name + ", cpassword=" + cpassword + ", Email="
				+ Email + ", phoneno=" + phoneno + ", usertype=" + usertype + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Email, cpassword, first_name, phoneno, userId, usertype);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Userdetail other = (Userdetail) obj;
		return Objects.equals(Email, other.Email) && Objects.equals(cpassword, other.cpassword)
				&& Objects.equals(first_name, other.first_name) && Objects.equals(phoneno, other.phoneno)
				&& userId == other.userId && Objects.equals(usertype, other.usertype);
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public Userdetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userdetail(int userId, String first_name, String cpassword, String email, Long phoneno, String usertype) {
		super();
		this.userId = userId;
		this.first_name = first_name;
		this.cpassword = cpassword;
		this.Email = email;
		this.phoneno = phoneno;
		this.usertype = usertype;
	}

	public Userdetail(String string, String string2, String string3, long long1, int int1, String string4) {
		// TODO Auto-generated constructor stub
		this.first_name=string;
		this.cpassword=string2;
		this.Email=string3;
		this.phoneno=long1;
		this.userId=int1;
		this.usertype=string4;
	}
	
	

	
	
}
