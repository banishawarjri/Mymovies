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
        
        ResultSet rs;
                
        rs=st.executeQuery("Select Movie_name from movies where Year_of_Realease=\"2014-11-07\"");
        
            while(rs.next())
            {
                    System.out.print(rs.getString(1));
            }
         
        rs.close();
        st.close();
        conn.close();
    }
    
}
