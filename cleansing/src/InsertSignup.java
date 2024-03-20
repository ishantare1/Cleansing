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
public class InsertSignup  {
    public static void main(String[] args)
    {
        try
        {
        
         Scanner sc = new Scanner(System.in);
         System.out.println("User Enter id"); 
         String id=sc.next();
         System.out.println("Enter Full name");
         String name=sc.next();
         System.out.println("Enter password");
         String password=sc.next();
         System.out.println("Enter gender");
         String gender=sc.next();
         System.out.println("Enter contact no");
         String contactNo=sc.next();
         System.out.println("Enter mail id"); 
         String mailId=sc.next(); 
         System.out.println("Enter Dob"); 
         String dob=sc.next();
         System.out.println("Enter Address ");
         String address=sc.next();
         System.out.println("Enter Country");
         String country=sc.next();
         System.out.println("Enter city");
         String city=sc.next();
         System.out.println("Enter pincode");
         String pincode=sc.next();
         
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root"); 
         PreparedStatement st=con.prepareStatement ("insert into customer values (?,?,?,?,?,?,?,?,?,?,?) ");

         st.setString (1, "id");
         st.setString (2, "fullname");
         st.setString (3, "password");
         st.setString (4, "gender");
         st.setString (5, "contact no");
         st.setString (6, "mail id");
         st.setString (7, "Dob");
         st.setString (8, "address");
         st.setString (9, "pincode");
         st.setString (10, "city");
         st.setString (11, "pincode");

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