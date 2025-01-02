package com.userlogin;

class Citizen implements UserLogin{
	int citizenId;
	String name;
	int age;
	String address;
	String username;
	String password;
	String privileges;
	String userType;
	
	//constructor
	public Citizen(int citizenId ,String name ,int age, String address ,String privileges,String userType){
		this.citizenId=citizenId;
		this.name=name;
		this.age=age;
		this.address=address;
		this.privileges=privileges;
		this.userType=userType;
	}
	//getters 
	public int getCitizenId(){
		return citizenId;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getAddress(){
		return address;
	}
	public String getUserName(){
		return username;
	}
	public String getPassword(){
		return password;
	}
	public String getPrivileges(){
		return privileges;
	}
	public String getUserType(){
		return userType;
	}
	
		
	//member functions
	
	public void updateDetailsCitizen(String address,String privileges){
		this.address=address;
		this.privileges=privileges;
		System.out.println("Details Updated");
	}
	
		
	
	//implementing the login method 
	@Override
	public boolean login(String username ,String password){
		if(this.username.equals(username) && this.password.equals(password)){
			System.out.println(name+" logged in successfully");
			return true;
		}
		System.out.println("login failed ");
		return false;
	}
	
	//implementing the logout method
	@Override
	public void logout(){
		System.out.println("logout "+name);
	}
	//implementing the register method 
	@Override
	public void register(String username ,String password ,String name){
		this.username=username;
		this.password=password;
		this.name=name;
		System.out.println("citizen" + name +" registered successfully ");
	}
	
}