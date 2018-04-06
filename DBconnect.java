package sample;

import java.sql.*;

public class DBconnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DBconnect()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");

            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airport","root","");
            st=con.createStatement();
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }

    public void getData(String flightID)
    {
        try{

            String query ="select * from "+flightID;
            rs =st.executeQuery(query);
            System.out.println("Records from the Database:");
            while(rs.next())
            {
                String name=rs.getString("Username");
                System.out.println(name);
            }

        }catch (Exception ex)
        {
            System.out.println(ex);
        }
    }


}
