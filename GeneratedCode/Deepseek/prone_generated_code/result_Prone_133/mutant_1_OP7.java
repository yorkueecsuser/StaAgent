import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

class BuggyPeriodGetTemporalUnit {
    public long showBug() {
        LocalDate from = LocalDate.of(2018, 6, 15);
        LocalDate to = LocalDate.of(2019, 7, 17);
        Period period = Period.between(from, to);
        long bug = period.get(ChronoUnit.WEEKS); // BUG: PeriodGetTemporalUnit
        boolean unreachable = getUnreachable();
        while (unreachable) {
            System.out.println("This is an unreachable while loop.");
        }
        return bug;
    }

    private boolean getUnreachable() {
        return false;
    }
}