import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        Duration duration = Duration.ofDays(daysToAdd);
        // Unreachable if-else branch
        boolean condition = getCondition(); // Ensures the condition is evaluated at runtime
        if (condition) {
            System.out.println("This block is never executed.");
        } else {
            System.out.println("This else block is also never executed.");
        }
        return date.plus(duration); // BUG: LocalDateTemporalAmount
    }

    private boolean getCondition() {
        return false; // The condition is always false, making the if-else unreachable.
    }

    public static void main(String[] args) {
        LocalDatePlusDurationExample example = new LocalDatePlusDurationExample();
        LocalDate today = LocalDate.now();
        LocalDate result = example.showBug(today, 5);
        System.out.println("Resulting Date: " + result);
    }
}