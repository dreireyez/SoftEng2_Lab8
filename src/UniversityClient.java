public class UniversityClient {
    public static void main(String[] args) {
        // 1. Create Leaves (Teachers and Students)
        // Computer Science Department
        Teacher csTeacher = new Teacher("Alice Smith", "Data Structures", 60000);
        Student csStudent1 = new Student("Bob Johnson", "CS101", 5000);
        Student csStudent2 = new Student("Charlie Brown", "CS102", 5000);

        // Information Technology Department
        Teacher itTeacher = new Teacher("David Wilson", "Web Development", 58000);
        Student itStudent = new Student("Eva Davis", "IT201", 4500);

        // Entertainment and Multimedia Computing Department
        Teacher mmTeacher = new Teacher("Frank White", "Game Development", 59000);
        Student mmStudent = new Student("Grace Lee", "MMC301", 4800);

        // Information Systems Department
        Teacher isTeacher = new Teacher("Henry Brown", "Database Management", 57000);
        Student isStudent = new Student("Iris Martinez", "IS401", 4600);

        // A student enrolled directly in the College
        Student directCollegeStudent = new Student("Jack Thompson", "GEN001", 4000);

        // 2. Create Composites (Departments)
        Department csDept = new Department("Department of Computer Science");
        csDept.addUnit(csTeacher);
        csDept.addUnit(csStudent1);
        csDept.addUnit(csStudent2);

        Department itDept = new Department("Department of Information Technology");
        itDept.addUnit(itTeacher);
        itDept.addUnit(itStudent);

        Department mmDept = new Department("Department of Entertainment and Multimedia Computing");
        mmDept.addUnit(mmTeacher);
        mmDept.addUnit(mmStudent);

        Department isDept = new Department("Department of Information Systems");
        isDept.addUnit(isTeacher);
        isDept.addUnit(isStudent);

        // 3. Create the Root Composite (College)
        College informaticsCollege = new College("College of Informatics and Computing Studies");
        informaticsCollege.addUnit(csDept);
        informaticsCollege.addUnit(itDept);
        informaticsCollege.addUnit(mmDept);
        informaticsCollege.addUnit(isDept);
        informaticsCollege.addUnit(directCollegeStudent);

        // 4. Demonstrate Functionality
        informaticsCollege.displayDetails();
        
        System.out.println("\n------------------------------------------------");
        System.out.println("Total Students in " + informaticsCollege.getName() + ": " + informaticsCollege.getStudentCount());
        System.out.printf("Total Budget for %s: ₱%,.2f%n", informaticsCollege.getName(), informaticsCollege.calculateBudget());
        System.out.println("------------------------------------------------");
    }
}