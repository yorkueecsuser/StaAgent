import java.util.Calendar;

class StaticNonThreadSafeExample {

    // Static non-thread-safe field
    private static Calendar calendar = Calendar.getInstance(); // BUG: Non-thread-safe fields should not be static

    public void updateCalendar(int year, int month, int day) {
        // Update the static calendar instance
        calendar.set(year, month, day);
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
}

// Mutant code with renamed variable
class StaticNonThreadSafeExampleMutant {

    // Static non-thread-safe field
    private static Calendar a = Calendar.getInstance(); // Renamed variable 'calendar' to 'a'

    public void updateCalendar(int year, int month, int day) {
        // Update the static calendar instance
        a.set(year, month, day); // Renamed variable 'calendar' to 'a'
    }

    public Calendar showBug() {
        // This method demonstrates the bug by showing how the static calendar is shared across instances
        return a; // Renamed variable 'calendar' to 'a'
    }

    public static void main(String[] args) {
        StaticNonThreadSafeExampleMutant instance1 = new StaticNonThreadSafeExampleMutant();
        StaticNonThreadSafeExampleMutant instance2 = new StaticNonThreadSafeExampleMutant();

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
}