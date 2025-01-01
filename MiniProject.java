import java.util.*;
//1. User login interface 
interface UserLogin{
	boolean login(String username , String password);
	void register(String username , String password , String name);
	void logout();
}

// 2. Citizen class is going to implement UserLogin Interface

class Citizen implements UserLogin{
	int citizenId;
	String name;
	int age;
	String address;
	String username;
	String password;
	String privileges;
	
	//constructor
	public Citizen(int citizenId ,String name ,int age, String address ,String privileges){
		this.citizenId=citizenId;
		this.name=name;
		this.age=age;
		this.address=address;
		this.privileges=privileges;
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
//SeniorCitizen Class which extends Citizen class
class SeniorCitizen extends Citizen{
	//constructor
	public SeniorCitizen(int citizenId,String name ,int age,String address ,String privileges){
		super(citizenId,name,age,address,privileges);
	}
	//special facility to seniorcitizens
	public void pensionApplication(){
		System.out.println(name+" applied  for pension application");
	}
}

//Student class which extends Citizen Class
class Student extends Citizen{
	//constructor
	public Student (intcitizenId, String name ,int age , String address ,String privileges){
		super(citizenId,name,age,address,privileges);
	}
	
	//special facility to Students
	public void scholarShip(){
		System.out.println(name +" applied for Scholarship");
	}
}

	

//3.Visitor class is going to implements interface.
class visitor implements UserLogin{
	 String username;
	 String password;
	 String name;
	 
	 //member functions
	 public void updateDetailsVisitor(String address ,String privileges){
		 this.address=address;
		 this.privileges=privileges;
		 System.out.println("Details Updated");
	 }
	 
	 
	 //implements the login method
	 @Override
	 public boolean login(String username ,String password){
		 if(this.username.equals(username) && this.password.equals.(password)){
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

//4. A citizen might request a garbage collection service, and the system will track when the request was made,
// its status (e.g., "Pending," "In Progress," "Completed"), and other details such as the time and location.
class ServiceRequest{
	String requestId;
	String serviceType;
	String status;
	String description;
	Date timestamp;
	int priority;
	
	//constructor
	public ServiceRequest(String requestId ,String serviceType ,String status ,String description ,long timestamp ,int priority){
		this.requestId=requestId;
		this.serviceType=serviceType;
		this.status=status;
		this.description=description;
		this.timestamp=timestamp;
		this.priority=priority;
	}
	//method  toString from java.lang package
	public String toString(){
		return "requestId= "+requestId+" servicetype= "+serviceType+" status="+status+" description= "+description+" timestamp= "+timestamp+" priority="+priority;
	}
	
	
	//getters
	public String getRequest(){
		return requestId;
	}
	public String getServiceType(){
		return serviceType;
	}
	public String getStatus(){
		return status;
	}
	public String getDescription(){
		return description;
	}
	public long getTimeStamp(){
		return timestamp;
	}
	public int getPriority(){
		return priority;
	}
	//setters
	public void setRequestId(String requestId){
		this.requestId=requestId;
	}
	public void setServicType(String serviceType){
		this.serviceType=serviceType;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public void setTimeStamp(long timestamp){
		this.timestamp=timestamp;
	}
	public void setPriority(int priority){
		this.priority=priority)
	}
}
//abstract class Departments : to handle the ServiceRequest
abstract class Department {
	public abstract void handlerequest(ServiceRequest request);
}
//Water Supplier Department 
class WaterSupplierDepartment extends Department{
	@Override 
	public void handleRequest(ServiceRequest request){
		System.out.println("This request is handling by waterSupplier Department: "+request);
	}
}
//Waste Management Department
class WasteManagementDepartment(ServiceRequest request){
	@Override
	public void handleRequest(ServiceRequest request){
		System.out.println("This request is handling by Waste Management Department :"+request);
	}
}
//Electricity Department
class ElectricityDepartment(ServiceRequest request){
	@Override
	public void handleRequest(ServiceRequest request){
		System.out.println("This request is handling by Electricity Department :"+request);
	}
}
//To Do List :
//1) if time limit is exceeded then status should be updated -TimeStampException()
//2) show the user the date when he send request by using java.util.Date (package which consist of long getTime() == Java Complete Refernce)
//Switch cases to handle requests
class RequestHandler{
	public static void SendingRequest(ServiceRequest request){
		Department department;
		switch(request.getServiceType()){
			case Water:
				department=new WaterSupplierDepartment();
				break;
			case Electricity:
				department=new ElectricityDepartment();
				break;
			case WaterSupplierDepartment:
				department=new WaterSupplierDepartment();
				break;
			default:
				System.out.println("invalid department request");
				break;
		}
//java.util.Date package imported so that when Date class object is invoked , then this object is converted((which will give Date and Time)) into string using toString()
		System.out.println("Request recieved at:"+request.getTimeStamp());
		request.setStatus("INPROGRESS");
		department.handleRequest(request);
	}
}


	

	

	 
	 
	
	
