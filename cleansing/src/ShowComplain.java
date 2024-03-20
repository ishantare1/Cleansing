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
public class ShowComplain {
    public static void main(String[] args)
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection con=DriverManager.getConnection( "jdbc.mysql://localhost:3306/test","root","root");
        PreparedStatement st=con.prepareStatement( "select* from complain");

        ResultSet rs=st.executeQuery();
        while(rs.next())
       {
        String cId =rs.getString(1); 
        String customerName= rs.getString(2);
        String complain= rs.getString(3);
        String complainDescription= rs.getString(4);
        String complainDate= rs.getString(5);
       
        System.out.println(cId+" "+customerName+" "+complain+" "+complainDescription+" "+complainDate);
       }
        con.close();
        }catch(SQLException | ClassNotFoundException ex)
      {
            ex.printStackTrace();
      }
   }
}