// Teacher.java
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
    public int countMembers() {
        return 0; // Teachers don't count towards the student total
    }

    @Override
    public void displayDetails() {
        System.out.println("  Teacher: " + name + " | Subject: " + subject + " | Salary: $" + salary);
    }

    @Override
    public double calculateBudget() {
        return salary; 
    }
}