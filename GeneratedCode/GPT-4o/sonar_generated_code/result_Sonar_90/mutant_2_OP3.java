import java.util.Calendar;

class StaticNonThreadSafeExample {

    // Static non-thread-safe field
    private static Calendar calendar = Calendar.getInstance(); // BUG: Non-thread-safe fields should not be static

    public void updateCalendar(int year, int month, int day) {
        // Update the static calendar instance
        calendar.set(year, month, day);
        
        // Unreachable if statement mutation
        boolean condition = getFalseCondition(); // This method always returns false
        if (condition) {
            System.out.println("This is an unreachable block and will never execute.");
        }
    }

    public Calendar showBug() {
        // This method demonstrates the bug by showing how the static calendar is shared across instances
        return calendar;
    }

    public static void main(String[] args) {
        StaticNonThreadSafeExample instance1 = new StaticNonThreadSafeExample();
        StaticNonThreadSafeExample instance2 = new StaticNonThreadSafeExample();

        // Thread 1 updates the calendar
        new Thread(() -> {
            instance1.updateCalendar(2023, Calendar.JANUARY, 1);
            System.out.println("Thread 1: " + instance1.showBug().getTime());
        }).start();

        // Thread 2 updates the calendar
        new Thread(() -> {
            instance2.updateCalendar(2024, Calendar.FEBRUARY, 2);
            System.out.println("Thread 2: " + instance2.showBug().getTime());
        }).start();
    }
    
    // Method to provide a false condition for the unreachable if statement
    private boolean getFalseCondition() {
        return false;
    }
}