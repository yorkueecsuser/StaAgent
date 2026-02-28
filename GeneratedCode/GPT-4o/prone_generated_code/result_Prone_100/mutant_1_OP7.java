import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        Duration duration = Duration.ofDays(daysToAdd);
        
        boolean conditionWhile = getCondition(); // Dynamically determine condition
        while (conditionWhile) { // Unreachable while loop
            System.out.println("This will never be printed");
        }

        return date.plus(duration); // BUG: LocalDateTemporalAmount
    }

    private boolean getCondition() {
        return false; // This method ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        LocalDatePlusDurationExample example = new LocalDatePlusDurationExample();
        LocalDate today = LocalDate.now();
        LocalDate result = example.showBug(today, 5);
        System.out.println("Resulting Date: " + result);
    }
}