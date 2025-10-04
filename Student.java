public class Student {

    // instance variables
    private String name;
    private double gpa;

    // constructor
    public Student(String studentName, double studentGpa) {
        name = studentName;
        gpa = studentGpa;
    }

    // method to introduce the student
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and my GPA is " + gpa);
    }

    // method to check if the student is on the honor roll
    public void checkHonorRoll() {
        if (gpa >= 3.5) {
            System.out.println(name + " is on the honor roll!");
        } else {
            System.out.println(name + " is not on the honor roll.");
        }
    }
}
