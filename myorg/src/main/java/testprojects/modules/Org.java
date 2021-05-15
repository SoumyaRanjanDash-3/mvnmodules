package testprojects.modules;

import testprojects.modules.Employee;
import testprojects.modules.Achivements;

public class Org{
	//String empCode = "";
	public static void main(String[] args){
		String empCode = "10002";
		
		Employee emp = new Employee();
		emp.setEmpCode(empCode);
		emp.getName();
		
		
		Achivements awards=new Achivements();
		awards.setEmpCode(empCode);
		awards.displayAward();
		
	} 
	
}