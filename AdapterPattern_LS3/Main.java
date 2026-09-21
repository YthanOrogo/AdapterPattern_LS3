public class Main {
    public static void main(String[] args) {
        // Instantiate legacy/adaptee systems
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(librarySystem);

        SchoolManagementApp[] systems = {
            attendanceAdapter,
            gradingAdapter,
            libraryAdapter
        };
        
        System.out.println("--- Starting Unified School Management Integration ---\n");
        for (SchoolManagementApp system : systems) {
            system.integrateSystem();
        }
        System.out.println("\n--- Integration Completed Successfully ---");
    }
}