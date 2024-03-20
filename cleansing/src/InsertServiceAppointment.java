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
public class InsertServiceAppointment{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            PreparedStatement st=con.prepareStatement("insert into service appointment values(?,?,?,?,?,?,?,?)");
            
            st.setString(1,"554433");
            st.setString(2,"ishan1");
            st.setString(3,"mohit2");
            st.setString(4,"6655");
            st.setString(5,"7 june");
            st.setString(6,"4 pm");
            st.setString(7,"6 pm");
            st.setString(8,"done");
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