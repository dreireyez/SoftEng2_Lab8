// Department.java
import java.util.ArrayList;
import java.util.List;

public class Department implements InstitutionalUnit {
    private String name;
    private List<InstitutionalUnit> units;

    public Department(String name) {
        this.name = name;
        this.units = new ArrayList<>();
    }

    public void addUnit(InstitutionalUnit unit) {
        units.add(unit);
    }

    public void removeUnit(InstitutionalUnit unit) {
        units.remove(unit);
    }

    @Override
    public int countMembers() {
        return units.stream().mapToInt(InstitutionalUnit::countMembers).sum();
    }

    @Override
    public void displayDetails() {
        System.out.println("\nDepartment: " + name);
        for (InstitutionalUnit unit : units) {
            unit.displayDetails();
        }
    }

    @Override
    public double calculateBudget() {
        // Automatically sums teacher salaries and negative student tuition [cite: 18]
        return units.stream().mapToDouble(InstitutionalUnit::calculateBudget).sum();
    }
}