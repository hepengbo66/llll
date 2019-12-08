package com.hepengbo.pojo;

public class User {
	
	private int id;
	
	private String phone;
	
	private String email;
	
	private String nickname;
	
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", phone=" + phone + ", email=" + email + ", nickname=" + nickname + ", age=" + age
				+ "]";
	}

	public User(int id, String phone, String email, String nickname, int age) {
		super();
		this.id = id;
		this.phone = phone;
		this.email = email;
		this.nickname = nickname;
		this.age = age;
	}

	public User() {
		super();
	}
	
	
	
}
