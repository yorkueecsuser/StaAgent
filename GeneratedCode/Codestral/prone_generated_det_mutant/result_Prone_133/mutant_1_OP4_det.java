import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        if (true && false && true && true && true && false && true && true && false && false && false) {short bhjejcfm = -2438;}else{float bcaycyom = -172987154;}
        // BUG: PeriodGetTemporalUnit
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    
}
}