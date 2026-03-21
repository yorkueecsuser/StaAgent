import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

class BuggyPeriodGetTemporalUnit {
    public long showBug() {
        LocalDate from = LocalDate.of(2018, 6, 15);
        LocalDate to = LocalDate.of(2019, 7, 17);
        Period period = Period.between(from, to);
        int lzkxpbhx = 0;switch  (lzkxpbhx) {case 1:double dcduslbo = 172460747;break;default:int fxdrfdoo = -163434191;break;}
        long bug = period.get(ChronoUnit.WEEKS); // BUG: PeriodGetTemporalUnit
        return bug;
    
}
}