/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;
import java.sql.*;  
public class CodeForSearch
{  
public static void main(String args[]) throws SQLException{  
   try{
            Class.forName("com.mysql.cj.jdbc.Driver");
           try (
                  
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookticket","root","")) {
                System.out.println("Connected");
               java.sql.PreparedStatement ps=con.prepareStatement("select * from traindetails where  From_where=? and To_where=?" );
               //ps=con.prepareStatement(sql);
              // ps.setInt(1,5);
               ps.setString(1,"CHITTAGONG");
               ps.setString(2,"DHAKA");
               //ps.setInt(2, 2);
               
              // ps.setString(2, name);
              // ps.execute();
            ResultSet  rs=ps.executeQuery();
            System.out.println("Serial_No\tTrain_Name\tTime");
            while(rs.next()){
           // System.out.print(rs.getInt(1));
            System.out.print(rs.getInt(1));
             System.out.print("\t"+ rs.getString(4));
              System.out.println("\t"+ rs.getString(5));
              Train_time.main(new String[0]);
            }
            con.close();
           }
            //this.dispose();
            
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }}
} 