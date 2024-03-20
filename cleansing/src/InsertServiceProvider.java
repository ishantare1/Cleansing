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
public class InsertServiceProvider{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            PreparedStatement st=con.prepareStatement("insert into service provider values(?,?,?,?,?,?,?)");
            
            st.setString(1,"211");
            st.setString(2,"8602");
            st.setString(3,"rohan");
            st.setString(4,"sharma");
            st.setString(5,"8603");
            st.setString(6,"male");
            st.setString(7,"working");
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

