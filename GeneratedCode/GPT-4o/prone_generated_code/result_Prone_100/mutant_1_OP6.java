import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {

    private boolean getLoopCondition() {
        return false;
    }

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        // Unreachable for loop inserted here
        boolean conditionFor = getLoopCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable.");
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