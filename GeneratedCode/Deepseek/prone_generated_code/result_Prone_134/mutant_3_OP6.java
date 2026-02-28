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

        // Mutant code
        boolean unreachableLoopCondition = getUnreachableLoopCondition();
        for (int i = 0; unreachableLoopCondition; i++) {
            System.out.println("This is an unreachable loop");
        }
    }

    private boolean getUnreachableLoopCondition() {
        return false;
    }
}