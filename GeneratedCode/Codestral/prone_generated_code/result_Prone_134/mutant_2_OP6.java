import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period period, Duration duration) {
        boolean conditionFor = getCondition(); // Added a method call to avoid using a compile-time constant
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This code will never be executed
            System.out.println("This is an unreachable loop.");
        }
        return period.plus(duration);
    }

    private boolean getCondition() {
        return false; // Method ensures the condition for the for loop is always false
    }

    public static void main(String[] args) {
        Period period = Period.ofYears(1);
        Duration duration = Duration.ofDays(1);
        PeriodTimeMathBug bug = new PeriodTimeMathBug();
        Period result = bug.showBug(period, duration);
        System.out.println(result);
    }
}