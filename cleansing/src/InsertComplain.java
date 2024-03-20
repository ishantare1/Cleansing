/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ishan
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
public class InsertComplain{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            PreparedStatement st=con.prepareStatement("insert into complain values(?,?,?,?,?,?,?)");
            
            st.setString(1,"21133");
            st.setString(2,"rohit");
            st.setString(3,"jain");
            st.setString(4,"work pending");
            st.setString(5,"my work still pending");
            st.setString(6,"2");
            st.setString(7,"pending");
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