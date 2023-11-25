/* 17.	WAP to print all numeric digits sum of all database column values.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Q17 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/temp1",usnm="yourusername",pass="yourpassword";
        try {
            Connection con=DriverManager.getConnection(url, usnm, pass);
            Statement s=con.createStatement();
            ResultSet rs=s.executeQuery("select SUM(id) from temptable");
            rs.next();
            System.out.print(rs.getInt(1));
        } catch (Exception e) {
        e.printStackTrace();
        }
    }  
}
