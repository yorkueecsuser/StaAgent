import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        Duration duration = Duration.ofDays(daysToAdd);
        return date.plus(duration); // BUG: LocalDateTemporalAmount
    }

    public static void main(String[] args) {
        LocalDatePlusDurationExample example = new LocalDatePlusDurationExample();
        LocalDate today = LocalDate.now();
        LocalDate result = example.showBug(today, 5);
        System.out.println("Resulting Date: " + result);

        // Adding a mutant with an unreachable switch statement
        int unreachableCondition = (int) (Math.random() * 10); // Ensures the condition is dynamically determined
        switch (unreachableCondition) {
            case 100: // This case is unreachable as unreachableCondition will never be 100
                System.out.println("This is an unreachable code block");
                break;
            default:
                // No action needed
                break;
        }
    }
}