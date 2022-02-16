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
               
         //query to create a  table 
         String sqllite="Create table Movies" 
                       + "(Movie_name VARCHAR(200) NOT NULL,"
                       + "Actor_Name VARCHAR(200),"
                       + "Actress_Name VARCHAR(200),"
                       + "Year_Of_Realease TEXT NOT NULL,"
                       + "Director_Name VARCHAR(200) NOT NULL)";
                 
        st.executeUpdate(sqllite);
        
        System.out.println("Created Table in Database");
   
        st.close();
        conn.close();
    }
    
}
