package com.hf.pro.model;

public class User{
	
	private int id ;
	
	private String userName ;
	
	private String password ;
	
	private String code ;
	
	private String phone ;
	
	private String address ;	
	
	private String email ;

	public User() {
		super();
		// TODO 自动生成的构造函数存根
	}



	public User(int id, String userName, String password, String code, String phone, String address, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.code = code;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	
}
