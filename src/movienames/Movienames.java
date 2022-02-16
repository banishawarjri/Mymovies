package movienames;

import java.sql.*;
import java.util.*;

public class Movienames {

 
    public static void main(String[] args) throws Exception {
        
        
        String[] insert=new String[10]; 
        
        //load driver
	Class.forName("org.sqlite.JDBC");
                
        //establishing connection
	Connection conn=DriverManager.getConnection("jdbc:sqlite:D:/sqlite/Mymovies.db");
        
        //Obtain a statement
        Statement st=conn.createStatement();
         
        //insert datas into the database
        insert[0]="insert into Movies values(\"The Notebook\","
                         + "\"Ryan Gosling\","
                         + "\"Rachel Mc Adams\","
                         + "\"2004-05-20\","
                         + "\"Nick Cassavetes\")";
 
        insert[1]="insert into Movies values(\"Baby's Day Out\","
                         + "\"Joe Mantegna\","
                         + "\"Lara Flynn Boyle\","
                         + "\"1994-07-01\","
                         + "\"Patrick Read Johnson\")";
        
        insert[2]="insert into Movies values(\"Home Alone\","
                         + "\"Macaulay Culkin\","
                         + "\"Catherine O'Hara\","
                         + "\"1991-10-18\","
                         + "\"Chris Columbus\")";
        
        insert[3]="insert into Movies values(\"Pushpa:The Rise\","
                         + "\"Allu Arjun\","
                         + "\"Rashmika Mandanna\","
                         + "\"2021-12-17\","
                         + "\"Sukumar\")";   
        
        insert[4]="insert into Movies values(\"Teacher's Dairy\","
                         + "\"Hualampong Riddim\","
                         + "\"Vichaya Vatanasapt\","
                         + "\"2014-03-20\","
                         + "\"Nithiwat Tharathorn\")";
        
        insert[5]="insert into Movies values(\"Home Alone 2:Lost in New York\","
                         + "\"Macaulay\","
                         + "\"Catherine O'Hara\","
                         + "\"1992-11-15\","
                         + "\"Chris Columbus\")";
        
        insert[6]="insert into Movies values(\"Stairway to heaven\","
                         + "\"Kwon Sang-woo\","
                         + "\"Choi Ji-woo\","
                         + "\"2004-02-05\","
                         + "\"Lee Jang-su\")";
        
        insert[7]="insert into Movies values(\"Onaatah:Of the earth\","
                         + "\"Merlvin Mukhim\","
                         + "\"Sweety Pala\","
                         + "\"2016-05-13\","
                         + "\"Pradip Kurbah\")";
        
              
        insert[8]="insert into Movies values(\"The Theory Of Everything\","
                         + "\"Eddie Redmayne\","
                         + "\"Felicity Jones\","
                         + "\"2014-11-07\","
                         + "\"James Marsh\")";
        
              
        insert[9]="insert into Movies values(\"Inferno\","
                         + "\"Tom Hanks\","
                         + "\"Felicity Jones\","
                         + "\"2016-10-14\","
                         + "\"Ron Howard\")";
        
        
        
        
        for(int i=0;i<10;i++)
        {
            st.executeUpdate(insert[i]);
        }
        
        System.out.println("Values added to the database");
   
        st.close();
        conn.close();
    }
    
}
