import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

class BuggyPeriodGetTemporalUnit {
    public long showBug() {
        LocalDate from = LocalDate.of(2018, 6, 15);
        LocalDate to = LocalDate.of(2019, 7, 17);
        Period period = Period.between(from, to);
        long bug = period.get(ChronoUnit.WEEKS); // BUG: PeriodGetTemporalUnit
        
        // Unreachable if-else statement mutation
        if (false) {
            System.out.println("This is an unreachable branch");
        } else {
            bug = bug + 1;
        }

        return bug;
    }
}