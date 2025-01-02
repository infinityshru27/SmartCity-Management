package com.userlogin;

//3.Visitor class is going to implements interface.
class visitor implements UserLogin{
	 String username;
	 String password;
	 String name;
	 String address;
	 String privileges;
	 
	 //member functions
	 public void updateDetailsVisitor(String address ,String privileges){
		 this.address=address;
		 this.privileges=privileges;
		 System.out.println("Details Updated");
	 }
	 
	 
	 //implements the login method
	 @Override
	 public boolean login(String username ,String password){
		 if(this.username.equals(username) && this.password.equals(password)){
			 System.out.println("visitor "+ name+ "login in successfully");
			 return true;
		 }
		 System.out.println("login failed ");
		 return false;
	 }
	 //implementing the register method for visitors 
	 @Override
	 public void logout(){
		 System.out.println("visitor "+name +"logged out");
	 }
	 
	 //implementing the register method for visitors 
	 @Override 
	 public void register(String username ,String password ,String name){
		 this.username=username;
		 this.password=password;
		 this.name=name;
		 System.out.println("visitor "+ name +"registered successfully");
	 }
	 
	 
}
