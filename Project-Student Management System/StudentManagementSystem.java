public class StudentManagementSystem {
    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent(
            "Aman", 21, 101, 88.5, "Computer Science"
        );

        System.out.println("---- Student Details ----");
        g.displayGraduate();
    }
}