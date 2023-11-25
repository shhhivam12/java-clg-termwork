/* 18.	WAP to update a table column value using stored procedures.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Q18 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/temp1",usnm="root",pass="yourpass";
        try {
            Connection con=DriverManager.getConnection(url, usnm, pass);
            Statement s=con.createStatement();
            s.executeUpdate("CALL new_updatename");
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
