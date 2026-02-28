import java.time.Duration;
import java.time.Period;

class DurationFromBug {
    public Duration showBug1(Duration duration) {
        if (getFalseCondition()) {   // This condition is always false
            System.out.println("Unreachable code");
        } else {
            // Existing code
            return Duration.from(duration);
        }
    }

    // Helper method to always return false
    private boolean getFalseCondition() {
        return false;
    }

    // Rest of the code...
}