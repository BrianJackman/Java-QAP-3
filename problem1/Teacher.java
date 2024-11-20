/*
 * Java QAP 3
 * By: Brian Jackman
 * 2024 11 21
 */

 package problem1;

public class Teacher extends Person {
    private String subject; // Teacher's subject
    private double salary; // Teacher's salary

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // Getter and Setter methods
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: " + salary;
    }
}