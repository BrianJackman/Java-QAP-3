/*
 * Java QAP 3
 * By: Brian Jackman
 * 2024 11 21
 */

public class Student extends Person {
    protected String myIdNum; // Student Id Number
    protected double myGPA; // Student GPA

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getter and Setter methods
    public String getIdNum() {
        return myIdNum;
    }

    public void setIdNum(String idNum) {
        myIdNum = idNum;
    } 

    public double getGPA() {
        return myGPA;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}