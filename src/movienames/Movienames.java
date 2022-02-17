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
                
        rs=st.executeQuery("select * from movies where director_name like \"C%\" or director_name like \"P%\"");
        
            while(rs.next())
            {
                    System.out.println(rs.getString(1));
            }
         
        rs.close();
        st.close();
        conn.close();
    }
    
}
