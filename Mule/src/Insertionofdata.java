import java.sql.*;

import java.util.*;
public class Insertionofdata {
	public static void main(String[] args) throws Exception
	{
		try {
			
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","swetha","swetha");
		 
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter number of records to be inserted : ");
		  
		  int n=sc.nextInt();
		  for(int i=0;i<n;i++)
		  {
		  
		  System.out.println("Enter  Movie Name:");
		  String name=sc.next();
		  
		  System.out.println("Enter leadactor Name:");
		  String leadactorname=sc.next();
		  
		  System.out.println("Enter actress Name: ");
		  String actressname=sc.next();
		  
		  System.out.println("Enter yearorrealase : ");
		  String yearofrealse=sc.next();
		  
		  System.out.println("Enter Directorname: ");
		  String directorname=sc.next();
		  
		    PreparedStatement pstmt=con.prepareStatement("insert into Movies values(?,?,?,?,?)");
		    pstmt.setString(1,name);
		    pstmt.setString(2,leadactorname);
		    pstmt.setString(3,actressname);
		    pstmt.setString(4,yearofrealse);
		    pstmt.setString(5,directorname);
		   
		    
		    pstmt.executeUpdate();
		    System.out.println("values inserted");
		  	}
		  con.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
