import java.sql.*;
public class TableCreation {
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","swetha","swetha");
	    PreparedStatement pstmt=con.prepareStatement("create table movies(moviename varchar2(50),leadactor varchar2(50),actress varchar2(50),yearofrealase varchar2(30),directorname varchar(30))");
	    System.out.println("Table created");
	    pstmt.executeUpdate();
	    con.close();
	}

}
