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

        // MUTANT: Unreachable switch statement
        boolean mutantCondition = getMutantCondition(d.getSeconds());
        switch (mutantCondition? 1 : 0) {
            case 1:
                System.out.println("This is an unreachable switch statement");
                break;
            case 0:
                // unreachable
        }
    }

    // This method is used in the unreachable switch statement
    // It always returns false, making the switch statement unreachable
    private boolean getMutantCondition(long seconds) {
        return seconds < 0;
    }
}