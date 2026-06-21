package StudentManegement;

public class Student {
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    private int studentId;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    private String studentName;

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    private String studentPhone;

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    private String studentCity;

    public Student() {
        super();
    }

    public Student(int studentId, String studentName, String studentPhone, String studentCity) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }
    public Student( String studentName, String studentPhone, String studentCity) {
        super();
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
