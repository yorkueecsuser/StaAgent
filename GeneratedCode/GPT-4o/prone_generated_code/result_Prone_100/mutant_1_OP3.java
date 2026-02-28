import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        Duration duration = Duration.ofDays(daysToAdd);
        boolean condition = getCondition(); // dynamically determined at runtime
        if (condition) {
            // This block is unreachable because condition always returns false
            System.out.println("This will never print");
        }
        return date.plus(duration); // BUG: LocalDateTemporalAmount
    }

    private boolean getCondition() {
        return false; // Simulates an unreachable condition
    }

    public static void main(String[] args) {
        LocalDatePlusDurationExample example = new LocalDatePlusDurationExample();
        LocalDate today = LocalDate.now();
        LocalDate result = example.showBug(today, 5);
        System.out.println("Resulting Date: " + result);
    }
}