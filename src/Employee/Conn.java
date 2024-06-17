package Employee;

import java.sql.*;

public class Conn{

    public Connection c;
    public Statement s;

    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/esystem","root","root");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}