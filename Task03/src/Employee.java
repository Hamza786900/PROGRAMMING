//Hamza Imran
//SP25-BCS-043
public class Employee{

	private String name;
	private int SSN;
	private double basesalary;
	private String address;

public Employee(String naam,int social,double tankha,String pata){
	this.name=naam;
	this.SSN=social;
	this.basesalary=tankha;
	this.address=pata;
}
public void setName(String newname){
	name=newname;
}
public void setSSN(int newSSN){
	SSN=newSSN;
}
public void setbasesalary(double newbasesalary){
	basesalary=newbasesalary;
}
public void setaddress(String newaddress){
	address=newaddress;
}

public void display(){
	System.out.println("Name:"+name);
	System.out.println("Social security number:"+SSN);
	System.out.println("Base Salary:"+basesalary);
	System.out.println("Address:"+address);


	
}
 }

