/*
 * Java QAP 3
 * By: Brian Jackman
 * 2024-11-21
 */


public class CollegeStudent extends Student {
    private String major; // Major of the college student
    private int year; // Year in college

    /**
     * Constructor for CollegeStudent
     * 
     * @param name   student's name
     * @param age    student's age
     * @param gender student'sgender 
     * @param idNum  student's ID
     * @param gpa    student's GPA
     * @param year   current year
     * @param major  student's major
     */
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    // Getter and Setter methods

    /**
     * Gets the major of the college student
     * 
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * Sets the major of the college student
     * 
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * Gets the current year in college
     * 
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the current year in college
     * 
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}