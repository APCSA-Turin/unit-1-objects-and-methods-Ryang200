public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 3.8);
        student1.introduce();
        student1.checkHonorRoll();

        Student student2 = new Student("Bob", 2.9);
        student2.introduce();
        student2.checkHonorRoll();
    }
}
