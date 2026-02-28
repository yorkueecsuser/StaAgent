import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class DurationExample {

    private boolean getFalseCondition() {
        return false;
    }

    public long showBug() {
        Duration duration = Duration.ofDays(1);
        try {
            // Inserting an unreachable while loop using a method call for the condition
            boolean conditionWhile = getFalseCondition();
            while (conditionWhile) {
                System.out.println("This is an unreachable code block.");
            }
            
            // Attempt to get the value of a TemporalUnit that is not SECONDS or NANOS
            long days = duration.get(ChronoUnit.DAYS); // BUG: DurationGetTemporalUnit
            return days;
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught UnsupportedTemporalTypeException: " + e.getMessage());
            return -1;
        }
    }

    public static void main(String[] args) {
        DurationExample example = new DurationExample();
        example.showBug();
    }
}