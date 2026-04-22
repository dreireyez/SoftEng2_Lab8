public class University {
    public static void main(String[] args) {
        // 1. Create Leaves (Teachers and Students)
        Teacher csTeacher = new Teacher("Alice Smith", "Data Structures", 60000);
        Student csStudent1 = new Student("Bob Johnson", "CS101", 5000);
        Student csStudent2 = new Student("Charlie Brown", "CS102", 5000);

        Teacher mathTeacher = new Teacher("David Wilson", "Calculus", 55000);
        Student mathStudent = new Student("Eva Davis", "MTH201", 4500);

        // A student enrolled directly in a College [cite: 5]
        Student directCollegeStudent = new Student("Frank White", "GEN001", 4000);

        // 2. Create Composites (Departments)
        Department csDept = new Department("Department of Computer Science");
        csDept.addUnit(csTeacher);
        csDept.addUnit(csStudent1);
        csDept.addUnit(csStudent2);

        Department mathDept = new Department("Department of Mathematics");
        mathDept.addUnit(mathTeacher);
        mathDept.addUnit(mathStudent);

        // 3. Create the Root Composite (College)
        College engineeringCollege = new College("College of Engineering");
        engineeringCollege.addUnit(csDept);
        engineeringCollege.addUnit(mathDept);
        engineeringCollege.addUnit(directCollegeStudent);

        // 4. Demonstrate Functionality
        engineeringCollege.displayDetails();
        
        System.out.println("\n------------------------------------------------");
        System.out.println("Total Students in " + engineeringCollege.getName() + ": " + engineeringCollege.countMembers());
        System.out.println("Total Budget for " + engineeringCollege.getName() + ": $" + engineeringCollege.calculateBudget());
        System.out.println("------------------------------------------------");
    }
}