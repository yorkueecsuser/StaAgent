import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        Duration duration = Duration.ofDays(daysToAdd);
        // Adding an unreachable if-else statement
        boolean isUnreachable = getCondition(); // this method returns a constant false
        if (isUnreachable) {
            System.out.println("This will never be printed.");
        } else {
            // Original code remains intact
            return date.plus(duration); // BUG: LocalDateTemporalAmount
        }
        return date; // This return is just to satisfy the method requirement. It won't ever be executed.
    }

    // Method to simulate a condition that returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        LocalDatePlusDurationExample example = new LocalDatePlusDurationExample();
        LocalDate today = LocalDate.now();
        LocalDate result = example.showBug(today, 5);
        System.out.println("Resulting Date: " + result);
    }
}