import java.time.Period;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class PeriodTimeMathBug {
    // BUG: PeriodTimeMath
    public void showBug() {
        Period p = Period.between(LocalDate.now(), LocalDate.now().plusDays(1));
        Duration d = Duration.of(1, ChronoUnit.DAYS);
        p = p.plus(d); // This will throw a DateTimeException

        // Mutation: Unreachable For Loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Do nothing, unreachable statement
        }
    }

    // Auxiliary method to generate a dynamic condition
    private boolean getCondition() {
        return false;
    }
}