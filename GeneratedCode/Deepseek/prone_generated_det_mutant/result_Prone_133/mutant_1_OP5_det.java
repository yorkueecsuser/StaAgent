import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

class BuggyPeriodGetTemporalUnit {
    public long showBug() {
        LocalDate from = LocalDate.of(2018, 6, 15);
        LocalDate to = LocalDate.of(2019, 7, 17);
        Period period = Period.between(from, to);
        int ecviyynl = 0;switch  (ecviyynl) {case 1:long ptsooceq = -838432977;break;default:long fagwxxhh = 122500399;break;}
        long bug = period.get(ChronoUnit.WEEKS); // BUG: PeriodGetTemporalUnit
        return bug;
    
}
}