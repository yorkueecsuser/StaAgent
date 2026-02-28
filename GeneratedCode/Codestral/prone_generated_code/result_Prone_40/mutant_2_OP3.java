import java.time.Duration;
import java.time.Period;

class DurationFromBug {
    public Duration showBug1(Duration duration) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This is an unreachable code block.");
        }
        return Duration.from(duration);
    }

    private boolean getUnreachableCondition() {
        return false; // This method ensures the condition is always false
    }

    // Rest of the code remains the same...
}