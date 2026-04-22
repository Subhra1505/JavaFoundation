class GraduateStudent extends Student {
    String specialization;

    // Constructor
    GraduateStudent(String name, int age, int rollNo, double marks, String specialization) {
        super(name, age, rollNo, marks);
        this.specialization = specialization;
    }

    void displayGraduate() {
        displayStudent();
        System.out.println("Specialization: " + specialization);
    }
}