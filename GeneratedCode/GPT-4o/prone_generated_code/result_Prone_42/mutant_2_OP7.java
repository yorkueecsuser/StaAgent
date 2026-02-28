import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationExample {

    public void showBug() {
        // This will throw a DateTimeException because YEARS is not a supported TemporalUnit for Duration
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        
        // Unreachable while loop mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }
    }
    
    private boolean getCondition() {
        return false; // This method returns false, ensuring the while loop above is unreachable.
    }

    public static void main(String[] args) {
        DurationExample example = new DurationExample();
        try {
            example.showBug();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}