public class Teacher implements InstitutionalUnit {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public int getStudentCount() {
        return 0; // Teachers don't count towards the student total
    }

    @Override
    public void displayDetails() {
        System.out.printf("  Teacher: %s | Subject: %s | Salary: ₱%,.2f%n", name, subject, salary);
    }

    @Override
    public double calculateBudget() {
        return salary; 
    }
}