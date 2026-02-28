import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        Duration duration = Duration.ofDays(daysToAdd);
        // Unreachable while loop mutation added here
        boolean conditionWhile = getCondition(); // This ensures the condition is not a compile-time constant
        while (conditionWhile) {
            System.out.println("This is unreachable code.");
        }
        return date.plus(duration); // BUG: LocalDateTemporalAmount
    }

    // Method to return a condition that is always false
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