import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

class BuggyPeriodGetTemporalUnit {
    public long showBug() {
        LocalDate from = LocalDate.of(2018, 6, 15);
        LocalDate to = LocalDate.of(2019, 7, 17);
        Period period = Period.between(from, to);
        long bug = period.get(ChronoUnit.WEEKS); // BUG: PeriodGetTemporalUnit
        
        // Mutation Operator: Unreachable for loop
        // Original code: return bug;
        boolean condition = false;
        for (int i = 0; condition; i++) {
            if (i == 10000) {
                condition = true;
            }
        }
        return bug;
    }
}