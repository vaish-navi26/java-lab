
import java.util.*;

public class prac {
   Scanner sc= new Scanner(System.in);
	public prac() {
		System.out.println("Enter name:");
		String name= sc.nextLine();
		
		System.out.println("Enter roll:");
		int roll= sc.nextInt();
		
		System.out.println("name:"+name+" "+"roll:"+roll);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        prac test=new prac();
	}

}
