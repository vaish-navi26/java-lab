package ex;
import java.util.*;
import java.lang.*;

class Attendance extends Thread{
	public void run() {
		if(Thread.currentThread().getName()=="cA") {
			System.out.println("u r in class A");
		}
		else if(Thread.currentThread().getName()=="cB") {
			System.out.println("u r in class B");
		}
	}
}
public class prac {
  
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Attendance o1 = new Attendance();
		Attendance o2 = new Attendance();
		
		o1.setName("cA");
		o2.setName("cB");
		
		System.out.println("Enter class:");
		String c = sc.nextLine();
		if(c.equals("A")) {
			o1.start();
		}
		else if(c.equals("B")) {
			o2.start();
		}
	}
}
