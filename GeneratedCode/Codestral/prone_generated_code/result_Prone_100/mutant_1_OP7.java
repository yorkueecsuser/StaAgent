import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {
    private static boolean getUnreachableCondition() {
        return false;
    }

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();

        // Added unreachable while loop
        while (getUnreachableCondition()) {
            // This code is unreachable
            System.out.println("This is an unreachable while loop.");
        }

        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        return date.plus(Duration.ofDays(1));
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}