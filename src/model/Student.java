package model;

public class Student {
    int studentId=1;
    String studentName="Input Name Student";
    int age=18;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }
    public Student() {
    }

    public Student(int studentId, String studentName, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "studentId=" + studentId + '\''+
                ", studentName='" + studentName + '\'' +
                ", age=" + age+ "\t"
                ;
    }
}
