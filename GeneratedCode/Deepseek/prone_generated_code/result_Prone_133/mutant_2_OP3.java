import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

class MutantPeriodGetTemporalUnit {
    public long showBug() {
        LocalDate from = LocalDate.of(2018, 6, 15);
        LocalDate to = LocalDate.of(2019, 7, 17);
        Period period = Period.between(from, to);
        long bug = period.get(ChronoUnit.WEEKS); // BUG: PeriodGetTemporalUnit
        boolean condition = false;
        if (condition) {
            return bug;
        } else {
            System.out.println("This code is unreachable because the condition is always false");
            return 0;
        }
    }
}