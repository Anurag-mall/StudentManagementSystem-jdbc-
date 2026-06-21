package StudentManegement;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

    public static Connection createC() {

       Connection con = null;

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database Details
            String url = "jdbc:mysql://localhost:3306/student_mange";
            String user = "root";
            String password = "Anuragmall123";

            // Create Connection
           con = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}