import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    private static boolean getUnreachableCondition() {
        return false;
    }

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        // Adding unreachable if statement
        if (getUnreachableCondition()) {
            // This code is unreachable
            System.out.println("This is an unreachable if statement.");
        }
        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        return date.plus(Duration.ofDays(1));
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}