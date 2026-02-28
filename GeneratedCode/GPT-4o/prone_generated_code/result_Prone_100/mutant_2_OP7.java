import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {
    
    // Method to determine the condition for the while loop
    private boolean getWhileCondition() {
        return false;
    }

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        // Unreachable while loop
        boolean conditionWhile = getWhileCondition();
        while (conditionWhile) {
            // This block will never execute
            System.out.println("This is unreachable code inside the while loop.");
        }
        
        Duration duration = Duration.ofDays(daysToAdd);
        return date.plus(duration); // BUG: LocalDateTemporalAmount
    }

    public static void main(String[] args) {
        LocalDatePlusDurationExample example = new LocalDatePlusDurationExample();
        LocalDate today = LocalDate.now();
        LocalDate result = example.showBug(today, 5);
        System.out.println("Resulting Date: " + result);
    }
}