
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    
    public connection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
            System.out.println("Connected");
        }catch(Exception e){//(ClassNotFoundException | SQLException e){
            System.err.println(e);
        }
    }
     public static void main(String[] args) {
 connection co= new connection();
       
    }
}
 