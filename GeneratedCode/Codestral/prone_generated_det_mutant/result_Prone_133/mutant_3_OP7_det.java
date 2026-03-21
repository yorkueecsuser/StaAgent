import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        boolean tcukzxlw = false;while (tcukzxlw && true && false && false && true && false && true && true && true && false && true && false) {char qbhbykqv = 'i';}
        // BUG: PeriodGetTemporalUnit
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    
}
}