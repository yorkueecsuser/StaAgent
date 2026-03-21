import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        if (false && false && false && false && true && false && false && true && true && false && false) {short eoqvuvcc = -6583;}else{long ynxkijhn = -742019625;}
        // BUG: PeriodGetTemporalUnit
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    
}
}