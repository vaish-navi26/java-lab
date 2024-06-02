
import java.sql.*;
import java.util.*;

class Payroll_System{
      private Connection connection;
      public Payroll_System(){
      try {
    	  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a1","root","root");
      }
      catch(SQLException e)
      {
    	  e.printStackTrace();
      }
      }
      
      public void add(String name,int id,int salary)
      {
    	  String query="Insert into employee(name,id,salary) values(?,?,?)";
    	  
    	  try(PreparedStatement preparedStatement=connection.prepareStatement(query)){
    		  preparedStatement.setString(1,name);
    		  preparedStatement.setInt(2,id);
    		  preparedStatement.setInt(3,salary);
    		  
    		  preparedStatement.executeUpdate();
    		  System.out.println("Added successfully");
    	  }
    	  catch(SQLException e)
    	  {
    		  e.printStackTrace();
    	  }
      }
      public void update(int id,int salary)
      {
    	  String query="UPDATE employee set salary=? WHERE id=?";
    	  
    	  try(PreparedStatement preparedStatement=connection.prepareStatement(query))
    	  {
    		  preparedStatement.setInt(1, salary);
    		  preparedStatement.setInt(2, id);
    		  
    		  int rowUpdated=preparedStatement.executeUpdate();
    		  
    		  if(rowUpdated>0)
    		  {
    			  System.out.println("Updated");
    		  }
    	  }
    	  catch(SQLException e)
    	  {
    		  e.printStackTrace();
    	  }
      }
}

public class ass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int id,salary;
		Scanner sc=new Scanner(System.in);
        Payroll_System obj= new Payroll_System();
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter id");
		id=sc.nextInt();
		System.out.println("Enter salary");
		salary=sc.nextInt();
		obj.add(name, id, salary);
		System.out.println("Enter salary");
		salary=sc.nextInt();
		obj.update(id, salary);
	}

}
