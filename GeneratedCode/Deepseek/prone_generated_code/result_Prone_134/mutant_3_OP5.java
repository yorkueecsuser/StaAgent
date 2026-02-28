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

        // Generated Mutant Code
        int value = getValue();
        switch(value) {
            case 1:
                break;
            default:
                break;
        }
    }

    // Non-final variable to avoid unreachable statement errors
    boolean getCondition() {
        return false;
    }

    // Non-final variable to avoid unreachable statement errors
    int getValue() {
        return 0;
    }
}