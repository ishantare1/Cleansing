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
public class InsertAdminPanel {
    public static void main(String[] args)
    {
        try
        {
        
         Scanner sc = new Scanner(System.in);
         System.out.println("Home"); 
         String home=sc.next();
         System.out.println("Setting");
         String setting=sc.next();
         System.out.println("Notification");
         String notification=sc.next();

         Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root"); 
         PreparedStatement st=con.prepareStatement ("insert into admin values (?, ?, ?) ");

         st.setString (1, "home");
         st.setString (2, "setting");
         st.setString (3, "notification");
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