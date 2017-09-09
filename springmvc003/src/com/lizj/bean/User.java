package com.lizj.bean;

public class User {

    private String id;

    private String loginId;
    
    private String password;
    
    private String name;
    
    private String sex;
    
    private int age;
    
    public User() {
        
    }

    public User(String id, String loginId, String password, String name, String sex,
            int age) {
        super();
        this.id = id;
        this.loginId = loginId;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
