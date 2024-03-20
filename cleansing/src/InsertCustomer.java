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
public class InsertCustomer{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the customer id");
            String cId =sc.next();
            System.out.println("Enter Customer password");
            String password =sc.next();
            System.out.println("Enter customer name");
            String cName =sc.next();
            System.out.println("Enter customer phone no");
            String cPhone =sc.next();
            System.out.println("Enter Customer Gender");
            String cGender=sc.next();
            System.out.println("Enter date of birth");
            String dob =sc.next();

            
            
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            PreparedStatement st=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
            
            st.setString(1,cId);
            st.setString(2,password);
            st.setString(3,cName);
            st.setString(4,cPhone);
            st.setString(5,cGender);
            st.setString(6,dob);
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
