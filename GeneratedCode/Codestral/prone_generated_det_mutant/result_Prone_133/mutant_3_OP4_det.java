import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        if (false && false && true && false && true && false && true && false && false && true && false) {byte hvohexih = 13;}else{char udomanbz = 'i';}
        // BUG: PeriodGetTemporalUnit
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    
}
}