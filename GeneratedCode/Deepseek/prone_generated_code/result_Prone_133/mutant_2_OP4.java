import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

class BuggyPeriodGetTemporalUnit {
    public long showBug() {
        LocalDate from = LocalDate.of(2018, 6, 15);
        LocalDate to = LocalDate.of(2019, 7, 17);
        Period period = Period.between(from, to);
        // Mutant Code
        if (false) {
            long bug = period.get(ChronoUnit.WEEKS); // Mutant 1: Unreachable if-else statement
        } else {
            long bug = 0;
        }
        // End of Mutant
        return bug;
    }
}