import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationExample {

    public void showBug() {
        // This will throw a DateTimeException because YEARS is not a supported TemporalUnit for Duration
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        
        // Unreachable switch statement
        int switchValue = getUnreachableValue();
        switch(switchValue) {
            case 999: // This case is designed to be unreachable
                System.out.println("This is unreachable");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }

    private int getUnreachableValue() {
        // Always returns a value that does not match the unreachable case
        return 0;
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