package com.marc2web.model;

public class User {
	private String name;
	
	private int age;
	private String email;
	private String city;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getCity() {
		return city;
	}


	
	public User(String name, int age, String email, String city) {
        super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.city = city;
	}
	
	
	
	

}
