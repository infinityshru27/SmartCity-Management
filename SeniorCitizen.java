package com.userlogin;

//SeniorCitizen Class which extends Citizen class
class SeniorCitizen extends Citizen{
	//constructor
	public SeniorCitizen(int citizenId,String name ,int age,String address ,String privileges){
		super(citizenId,name,age,address,privileges,"SeniorCitizen");
	}
	//special facility to seniorcitizens
	public void pensionApplication(){
		System.out.println(name+" applied  for pension application");
	}
}
