import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        Duration duration = Duration.ofDays(daysToAdd);
        
        // Unreachable for loop mutation
        boolean loopCondition = getLoopCondition();
        for (int i = 0; loopCondition; i++) {
            System.out.println("This line is unreachable.");
        }
        
        return date.plus(duration); // BUG: LocalDateTemporalAmount
    }
    
    private boolean getLoopCondition() {
        return false; // Ensures the loop is unreachable
    }

    public static void main(String[] args) {
        LocalDatePlusDurationExample example = new LocalDatePlusDurationExample();
        LocalDate today = LocalDate.now();
        LocalDate result = example.showBug(today, 5);
        System.out.println("Resulting Date: " + result);
    }
}