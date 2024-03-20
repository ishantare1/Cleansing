/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ishan
 */
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SearchService {
    public static void main(String[] args)
    {
        try
         {
           Scanner sc=new Scanner(System.in); 
           System.out.println(""); 
           String cId=sc.next();
           //System.out.println("");
           //String city= sc.next();

           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/test","root","root");
           //PreparedStatement st=con prepareStatement(select * from servicetab where servicetab=? and name=?");

           PreparedStatement st=con.prepareStatement( "select from service where cId=?");
           st.setString(1,cId);
           ResultSet rs=st.executeQuery();
           if(rs.next())
           {
            String serviceId=rs.getString(1);
            String ServiceName=rs.getString(2); 
            String serviceType=rs.getString(3);
            String ServiceCharge=rs.getString(4);
           
            System.out.println(serviceId+" "+ServiceName+" "+serviceType+" "+ServiceCharge);
           }
           else
           {
           System.out.println("no record found");
           }
            con.close();
        }catch(SQLException | ClassNotFoundException ex)
      {
            ex.printStackTrace();
      }
   }
}
