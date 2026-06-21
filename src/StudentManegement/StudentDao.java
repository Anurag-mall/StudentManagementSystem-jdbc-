package StudentManegement;

import java.sql.*;

public class StudentDao {


    public static boolean insertIntoDb(Student st){
        boolean f = false;
        try{
            Connection con =CP.createC();
            String sql = "Insert into Student(sname,sphone,scity) value(?,?,?)";
            PreparedStatement psmt =con.prepareStatement(sql);
            psmt.setString(1,st.getStudentName());
            psmt.setString(2,st.getStudentPhone());
            psmt.setString(3,st.getStudentCity());
            psmt.executeUpdate();

            f=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    public static boolean deleteStudent(int userId){
        boolean f = false;
        try{
           Connection con = CP.createC();
           String sql = "Delete from student where sid =?";
           PreparedStatement psmt = con.prepareStatement(sql);
           psmt.setInt(1,userId);
           psmt.executeUpdate();

           f=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static void studentDetails() {
        try {
            Connection con = CP.createC();

            String sql = "SELECT * FROM student";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                int id = rs.getInt("sid");
                String name = rs.getString("sname");
                String phone = rs.getString("sphone");
                String city = rs.getString("scity");

                System.out.println("ID    : " + id);
                System.out.println("Name  : " + name);
                System.out.println("Phone : " + phone);
                System.out.println("City  : " + city);
                System.out.println("--------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


public static boolean updatestudent(int userId, String newName){
        boolean f = false;
   try{ Connection con = CP.createC();
    String sql = "UPDATE student SET sname = ? WHERE sid = ?";
    PreparedStatement psmt = con.prepareStatement(sql);

    psmt.setString(1,newName);
    psmt.setInt(2,userId);
    psmt.executeUpdate();
f=true;
} catch (Exception e){
       e.printStackTrace();
   }
   return f;
   }
}