package com.userlogin;

//Student class which extends Citizen Class
class Student extends Citizen{
	//constructor
	public Student (int citizenId, String name ,int age , String address ,String privileges){
		super(citizenId,name,age,address,privileges,"Student");
	}
	
	//special facility to Students
	public void scholarShip(){
		System.out.println(name +" applied for Scholarship");
	}
}
//
