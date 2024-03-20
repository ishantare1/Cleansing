/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ishan
 */
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ShowService {
    public static void main(String[] args)
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection con=DriverManager.getConnection( "jdbc.mysql://localhost:3306/test","root","root");
        PreparedStatement st=con.prepareStatement( "select* from cservice");

        ResultSet rs=st.executeQuery();
        while(rs.next())
       {
        String serviceId =rs.getString(1); 
        String serviceName= rs.getString(2);
        String serviceType= rs.getString(3);
        String serviceCharge= rs.getString(4);
       
        System.out.println(serviceId+" "+serviceName+" "+serviceType+" "+serviceCharge);
       }
        con.close();
        }catch(SQLException | ClassNotFoundException ex)
      {
            ex.printStackTrace();
      }
   }
}