package ex;
import java.util.*;
import java.lang.*;

class Attendance implements Runnable{
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
		 Thread Thread1 = new Thread(o1);
		 Thread Thread2= new Thread(o2);
		Thread1.setName("cA");
		Thread2.setName("cB");
		
		System.out.println("Enter class:");
		String c = sc.nextLine();
		if(c.equals("A")) {
			Thread1.start();
		}
		else if(c.equals("B")) {
			Thread2.start();
		}
	}
}
