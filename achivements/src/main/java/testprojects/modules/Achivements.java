package testprojects.modules;
public class Achivements{
	String empCode = "";
	public void setEmpCode(String empCode){
		this.empCode=empCode;
	}
	public void displayAward(){
		if(empCode.equals("10001")){
			System.out.println("You are Bravo");
		}
		else if (empCode.equals("10002")){
			System.out.println("You are Champion");
		}
		else if (empCode.equals("10003")){
			System.out.println("You are Star Performer");
		}
		else {
			System.out.println("You are Expert");
		}
	}
	
	
	
}