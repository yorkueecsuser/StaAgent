import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        boolean conditionFor = getCondition(); // Used for unreachable for loop
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable
            System.out.println("This for loop is unreachable");
        }
        
        Duration duration = Duration.ofDays(daysToAdd);
        return date.plus(duration); // BUG: LocalDateTemporalAmount
    }

    // Method to determine the condition at runtime to prevent unreachable statement error
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