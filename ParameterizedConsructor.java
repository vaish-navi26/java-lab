package ex;
import java.util.*;

public class prac {
  
	int roll;
	String name;
	
	prac(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
	
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of entries:");
		int entries = sc.nextInt();
		sc.nextLine();		
		prac[] obj = new prac[entries];
		
		for(int i=0;i<entries;i++) {
			System.out.println("Enter name:");
			String name = sc.nextLine();
			System.out.println("Enter Roll:");
			int roll=sc.nextInt();
			sc.nextLine();	
			obj[i]= new prac(roll,name);
		}
		System.out.println("---Details---");
		for(int i=0;i<entries;i++) {
			System.out.println("student:"+ (i+1));
			System.out.println("name:"+obj[i].name);
			System.out.println("roll:"+obj[i].name);
		}
       
	}

}
