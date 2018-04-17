package sample;

import java.sql.*;
import java.util.ArrayList;

public class DBconnect {
    public Connection con;
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

    public ArrayList getData(String table, String Column) {
        ArrayList<String> data = null;
        try {
            data = new ArrayList<>();
            String query = "select * from " + table;
            rs = st.executeQuery(query);
            //System.out.println("Records from the Database:");
            while (rs.next()) {
                String d = rs.getString(Column);
                data.add(d);
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return data;
    }


}
