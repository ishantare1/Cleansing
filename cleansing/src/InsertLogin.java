/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ishan
 */
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
public class InsertLogin {
    public static void main(String[] args)
    {
        try
        {
        
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter mail id"); 
         String mailId=sc.next();
         System.out.println("Enter password");
         String password=sc.next();

         Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root"); 
         PreparedStatement st=con.prepareStatement ("insert into admin values (?, ?) ");

         st.setString (1, "mail id");
         st.setString (2, "password");
         st.executeUpdate();
         con.close();
         System.out.println("RECORD INSERTED");
      }
        catch(SQLException | ClassNotFoundException ex)
      {
            ex.printStackTrace();
      }
   }
}














