class Student extends Person {
    int rollNo;
    double marks;

    // Constructor
    Student(String name, int age, int rollNo, double marks) {
        super(name, age);  // calling parent constructor
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}
