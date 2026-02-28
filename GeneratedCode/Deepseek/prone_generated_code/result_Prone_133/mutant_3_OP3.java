import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

class BuggyPeriodGetTemporalUnit {
    public long showBug() {
        LocalDate from = LocalDate.of(2018, 6, 15);
        LocalDate to = LocalDate.of(2019, 7, 17);
        Period period = Period.between(from, to);
        long bug = period.get(ChronoUnit.WEEKS); // BUG: PeriodGetTemporalUnit
        return bug;
    }

    public boolean getCondition() {
        return false;
    }

    public void unreachableIfStatement() {
        if (getCondition()) {
            // Unreachable branch
            System.out.println("This is an unreachable code block.");
        }
    }
}