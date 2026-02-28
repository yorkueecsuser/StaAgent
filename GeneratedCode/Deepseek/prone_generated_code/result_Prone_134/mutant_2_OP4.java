import java.time.Period;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class PeriodTimeMathBug {
    // MUTANT: PeriodTimeMath
    public void showMutant() {
        Period p = Period.between(LocalDate.now(), LocalDate.now().plusDays(1));
        Duration d = Duration.of(1, ChronoUnit.DAYS);
        boolean mutantCondition = getMutantCondition();  // this is a new method to dynamically determine the condition
        if (mutantCondition) {
            p = p.plus(d);
        } else {
            // this unreachable code is placed in the else block
        }
    }

    // new method to dynamically determine the condition
    private boolean getMutantCondition() {
        return false;
    }
}