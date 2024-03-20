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
public class ShowCustomer {
    public static void main(String[] args)
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection con=DriverManager.getConnection( "jdbc.mysql://localhost:3306/test","root","root");
        PreparedStatement st=con.prepareStatement( "select* from customer");

        ResultSet rs=st.executeQuery();
        while(rs.next())
       {
        String id =rs.getString(1); 
        String name= rs.getString(2);
        String password= rs.getString(3);
        String gender= rs.getString(4);
        String phoneNo= rs.getString(5);
        String mailId= rs.getString(6);
        String dob= rs.getString(7);
        String address= rs.getString(8);
        String city= rs.getString(9);
        String pincode= rs.getString(10);
       
        System.out.println(id+" "+name+" "+password+" "+gender+" "+phoneNo+" "+mailId+" "+dob+" "+address+" "+city+" "+pincode);
       }
        con.close();
        }catch(SQLException | ClassNotFoundException ex)
      {
            ex.printStackTrace();
      }
   }
}
