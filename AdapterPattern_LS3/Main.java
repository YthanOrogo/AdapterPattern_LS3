public class Main {
    public static void main(String[] args) {
        // Instantiate legacy/adaptee systems
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        // Wrap legacy systems into their respective adapters
        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(librarySystem);

        // Store all adapters under the unified target interface
        SchoolManagementApp[] systems = {
            attendanceAdapter,
            gradingAdapter,
            libraryAdapter
        };

        // Uniformly execute the integrateSystem() method across all subsystems
        System.out.println("--- Starting Unified School Management Integration ---\n");
        for (SchoolManagementApp system : systems) {
            system.integrateSystem();
        }
        System.out.println("\n--- Integration Completed Successfully ---");
    }
}