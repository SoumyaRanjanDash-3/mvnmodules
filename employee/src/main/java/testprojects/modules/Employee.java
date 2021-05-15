package testprojects.modules;
public class Employee{
	String empName = "";
	String empCode = "";
	public void setEmpCode(String empCode){
		this.empCode = empCode;
	}
	public void getName(){
		if(empCode.equals("10001")){
			empName="Rama";
		}
		else if (empCode.equals("10002")){
			empName="Soumya";
		}
		else if (empCode.equals("10003")){
			empName="Sony";
		}
		else {
			empName="Ajay";			
		}
		System.out.println("The employee name is: "+ empName);
	}
	
	
}