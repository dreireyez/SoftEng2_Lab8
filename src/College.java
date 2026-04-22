import java.util.ArrayList;
import java.util.List;

public class College implements InstitutionalUnit {
    private String name;
    private List<InstitutionalUnit> units;

    public College(String name) {
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
        System.out.println("\n=== College: " + name + " ===");
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

    public String getName() {
        return name;
    }
}