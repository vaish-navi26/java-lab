package ex;
import java.util.*;


public class prac {
  
	public void display(int roll,String name) {
		try {
			if(name.isEmpty() || roll<0  ) {
				throw new IllegalArgumentException("invslid details");
			} 
			
		 System.out.println("Name:"+ name + " " + "Roll:" + roll);
			
		}catch(IllegalArgumentException e) {
			System.err.println("Error during reservation initialization: "
					+ e.getMessage());
		} catch(NullPointerException e) {
			System.err.println("Error displaying reservation details: " + e.getMessage());

		}
		finally {
			System.out.println("executed");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter roll:");
	    int roll = sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter name:");
	    String name= sc.nextLine();
	    
	    prac obj1 =new prac();
	   
		obj1.display(roll, name);
	    
	}
}
