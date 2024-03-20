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
public class DeleteCustomer {
    public static void main(String[] args)
    {
        try
         {
           Scanner sc=new Scanner(System.in); 
           System.out.println("Enter customer ID to delete complain"); 
           String cId=sc.next();
           //System.out.println("");
           //String city= sc.next();

           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/test","root","root");
           //PreparedStatement st=con prepareStatement(select * from servicetab where servicetab=? and name=?");

           PreparedStatement st=con.prepareStatement( "select from customer where cId=?");
           st.setString(1,cId);
           ResultSet rs=st.executeQuery();
           if(rs.next())
           {
            PreparedStatement st1=con.prepareStatement("delete from customer where cId=?");  
            st1.setString(1,cId);
            st1.executeUpdate();
            System.out.println("record delete");
          
           }
           else
           {
           System.out.println("no record found to deleteaw");
           }
            con.close();
        }catch(SQLException | ClassNotFoundException ex)
      {
            ex.printStackTrace();
      }
   }
}
