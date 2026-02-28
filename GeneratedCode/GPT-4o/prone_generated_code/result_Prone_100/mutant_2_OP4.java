import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        Duration duration = Duration.ofDays(daysToAdd);
        // Introducing a variable to use in an unreachable if-else statement
        boolean unreachableCondition = determineUnreachableCondition();

        // Unreachable if-else branch
        if (unreachableCondition) {
            System.out.println("This block is unreachable due to the condition being false.");
        } else {
            System.out.println("This is an unreachable else block too.");
        }

        return date.plus(duration); // BUG: LocalDateTemporalAmount
    }

    // Method to ensure the condition is always false at runtime
    private boolean determineUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        LocalDatePlusDurationExample example = new LocalDatePlusDurationExample();
        LocalDate today = LocalDate.now();
        LocalDate result = example.showBug(today, 5);
        System.out.println("Resulting Date: " + result);
    }
}