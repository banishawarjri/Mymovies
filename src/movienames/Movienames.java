package movienames;

import java.sql.*;
import java.util.*;

public class Movienames {

 
    public static void main(String[] args) throws Exception {
           
        //load driver
	Class.forName("org.sqlite.JDBC");
                
        //establishing connection
	Connection conn=DriverManager.getConnection("jdbc:sqlite:D:/sqlite/Mymovies.db");
        
        //Obtain a statement
        Statement st=conn.createStatement();
        
        //Retrieving all  Data from the database
        ResultSet rs;
                
        rs=st.executeQuery("select * from movies");
        
            while(rs.next())
            {
                 System.out.println();
                for(int i=1;i<=5;i++)
                    System.out.print(rs.getString(i)+"\t|");
            }
         
       rs.close();
        st.close();
        conn.close();
    }
    
}
