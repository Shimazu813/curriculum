package check;

import constants.Constants;

public class Check {
    private static String firstName = "初樹";
    private static String lastName = "島津";    
	
	public static void main(String[] args) {
		   String fl = printName(firstName, lastName);
		   print(fl);
		   
		   Pet pt = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		   pt.introduce();
		   
		   RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		   rp.introduce(); 		
	}
	private static String printName(String firstName, String lastName) {		
		return "printNameメソッド" + "→" + lastName + firstName;
	} 
	
    public static void print(String fl) {		
		System.out.println(fl);
	} 

}