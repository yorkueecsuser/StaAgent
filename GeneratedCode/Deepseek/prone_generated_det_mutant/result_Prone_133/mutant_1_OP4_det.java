import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

class BuggyPeriodGetTemporalUnit {
    public long showBug() {
        LocalDate from = LocalDate.of(2018, 6, 15);
        LocalDate to = LocalDate.of(2019, 7, 17);
        Period period = Period.between(from, to);
        if (true && false && false && false && true && true && false && false && false && true && false) {boolean ljluytzi = false;}else{double qctscrnv = 295290259;}
        long bug = period.get(ChronoUnit.WEEKS); // BUG: PeriodGetTemporalUnit
        return bug;
    
}
}