package movienames;

import java.sql.*;
import java.util.*;

public class Movienames {

 
    public static void main(String[] args) throws Exception {
        
        //load driver
	Class.forName("org.sqlite.JDBC");
                
        //database name
        String url="Mymovies.db";
		
        //establishing connection
	Connection conn=DriverManager.getConnection("jdbc:sqlite:D:/sqlite/"+url);
               
        System.out.println("Database is created");
                
    }
    
}
