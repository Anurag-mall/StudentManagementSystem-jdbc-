import StudentManegement.Student;
import StudentManegement.StudentDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true){
                System.out.println("press 1 for add Student");
                System.out.println("press 2 for delete Student");
                System.out.println("press 3 for display Student");
                System.out.println("press 4 for update Student");
                System.out.println("press 5 for exit app");

                int c = Integer.parseInt(br.readLine());

                if(c==1){

                    System.out.println("Enter user name :");
                    String name =br.readLine();

                    System.out.println("Enter user phone");
                    String phone = br.readLine();

                    System.out.println("Enter user city");
                    String city = br.readLine();

                    Student st = new Student(name,phone,city);
                    System.out.println(st);

                    boolean ans=StudentDao.insertIntoDb(st);
                    if(ans){
                        System.out.println("Student add Succesfully !!!");
                    }else {
                        System.out.println("Something wents wrongs");
                    }
                    System.out.println(ans);
                } else if (c==2) {

                    System.out.println("Enter userId for delete Student");
                    int userId = Integer.parseInt(br.readLine());
                   boolean ans= StudentDao.deleteStudent(userId);
                   if(ans){
                       System.out.println("Student are delete From database");
                   }else {
                       System.out.println("Something wents wrongs");
                   }

                    // delete Student
                } else if (c==3) {

                    System.out.println("Display the student table");
                    StudentDao.studentDetails();

                    // display Student
                } else if (c==4) {
                    System.out.println("Update the Student in table");
                    System.out.println("Enter userId : ");
                    int userId = Integer.parseInt(br.readLine());
                    System.out.println("Enter update name :");
                    String newName = br.readLine();
                    StudentDao.updatestudent(userId,newName);

                } else if (c==5) {

                    // exit
                    break;
                }else {


                }
            }
    }
}