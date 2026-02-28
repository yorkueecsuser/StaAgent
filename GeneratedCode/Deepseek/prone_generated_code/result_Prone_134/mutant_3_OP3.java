import java.time.Period;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class PeriodTimeMathBug {

    // BUG: PeriodTimeMath
    private boolean condition = true; // mutant code: condition is always true

    public void showBug() {
        Period p = Period.between(LocalDate.now(), LocalDate.now().plusDays(1));
        Duration d = Duration.of(1, ChronoUnit.DAYS);
        if (condition) {         // mutant code: the condition is always true
            p = p.plus(d);       // mutant code: this will always run
        }
    }
}