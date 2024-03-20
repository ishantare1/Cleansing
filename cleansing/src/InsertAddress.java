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
public class InsertAddress{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            PreparedStatement st=con.prepareStatement("insert into address values(?,?,?,?,?,?)");
            
            st.setString(1,"21155");
            st.setString(2,"radisson");
            st.setString(3,"radisson");
            st.setString(4,"indore");
            st.setString(5,"878798");
            st.setString(6,"madhya pradesh");
            
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