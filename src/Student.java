public class Student implements InstitutionalUnit {
    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public int getStudentCount() {
        return 1; // Each student counts as 1
    }

    @Override
    public void displayDetails() {
        System.out.printf("  Student: %s | ID: %s | Tuition: ₱%,.2f%n", name, studentId, tuitionFee);
    }

    @Override
    public double calculateBudget() {
        return -tuitionFee; 
    }
}