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
public class ShowServiceProvider {
    public static void main(String[] args)
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection con=DriverManager.getConnection( "jdbc.mysql://localhost:3306/test","root","root");
        PreparedStatement st=con.prepareStatement( "select* from serviceprovidertab");

        ResultSet rs=st.executeQuery();
        while(rs.next())
       {
        String spId =rs.getString(1); 
        String spName= rs.getString(2);
        String spPassword= rs.getString(3);
        String spServices= rs.getString(4);
        String spStatus= rs.getString(5);
        
        System.out.println(spId+" "+spName+" "+spPassword+" "+spServices+" "+spStatus);
       }
        con.close();
        }catch(SQLException | ClassNotFoundException ex)
      {
            ex.printStackTrace();
      }
   }
}