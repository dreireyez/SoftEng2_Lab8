// Student.java
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
    public int countMembers() {
        return 1; // Each student counts as 1
    }

    @Override
    public void displayDetails() {
        System.out.println("  Student: " + name + " | ID: " + studentId + " | Tuition: $" + tuitionFee);
    }

    @Override
    public double calculateBudget() {
        return -tuitionFee; 
    }
}