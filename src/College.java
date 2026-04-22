// College.java
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
    public int countMembers() {
        return units.stream().mapToInt(InstitutionalUnit::countMembers).sum();
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
        // Automatically sums budgets of departments, teachers, and (-tuition fees) [cite: 17]
        return units.stream().mapToDouble(InstitutionalUnit::calculateBudget).sum();
    }

    public String getName() {
        return name;
    }
}