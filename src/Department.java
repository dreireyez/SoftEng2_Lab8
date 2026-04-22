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
    public int getStudentCount() {
        int count = 0;
        for (InstitutionalUnit unit: units) {
            count += unit.getStudentCount();
        }
        return count;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n[Department] " + name);
        for (InstitutionalUnit unit : units) {
            unit.displayDetails();
        }
    }

    @Override
    public double calculateBudget() {
        double total = 0.0;
        for (InstitutionalUnit unit: units) {
            total += unit.calculateBudget();
        }
        return total;
    }
}