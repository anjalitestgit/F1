package p;
import java.sql.*;

public class A
{	
	public static void main(String[] args)
	{
		System.out.print("hello");
		System.out.println("MySQL Connect Example.");
		  Connection conn = null;
		  String url = "jdbc:mysql://localhost:3306/";
		  String dbName = "db1";
		  String driver = "com.mysql.jdbc.Driver";
		  String userName = "root"; 
		  String password = "root";
		  try 
		  {
		  		Class.forName(driver);
		 		conn = DriverManager.getConnection(url+dbName,userName,password);
				Statement sm=conn.createStatement();
				String s=args[0];//"tt";
				//String s1=
				String s1=args[1];//"e001";
				ResultSet rs=sm.executeQuery("select * from emp1 where ecode='"+s+"' and ename='"+s1+"'");
				//ResultSet rs=sm.executeQuery("select * from emp1 where ecode='E44' and ename='kk'");
				System.out.println("Connected to the database");
				
				while (rs.next())
				 {	
					String f2 = rs.getString(1);
		 			 String f = rs.getString(2);
					String f1 = rs.getString(3);
					 System.out.println(f2+"  "+f+"  "+f1);
				 }
				conn.close();
				System.out.println("Disconnected from database");
		  } 
		  catch (Exception e)
		  {
		 	 e.printStackTrace();
		  }

	}

}
