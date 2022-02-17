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
        
       
                
        st.executeUpdate("alter table movies rename column Year_Of_Realease to Year_Of_Release");
        
         System.out.println("Column Name Change");  
         
      
        st.close();
        conn.close();
    }
    
}
