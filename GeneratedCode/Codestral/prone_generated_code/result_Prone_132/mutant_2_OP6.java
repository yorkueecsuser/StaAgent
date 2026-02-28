import java.time.Duration;
import java.time.Period;

class PeriodFromBug {

    private boolean getCondition() {
        // Return a false condition to ensure the loop is unreachable
        return false;
    }

    public Period showBug(Duration duration) {
        Period period = Period.from(duration);

        // Add an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line should never be executed");
        }

        return period;
    }

    public static void main(String[] args) {
        PeriodFromBug bug = new PeriodFromBug();
        Period result = bug.showBug(Duration.ofDays(10));
        System.out.println(result); // This line will throw a DateTimeException
    }
}