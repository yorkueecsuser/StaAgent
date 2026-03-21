import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        boolean shuaogiq = false;while (shuaogiq && false && false && true && false && false && false && true && false && false && false && false) {char hsirhznc = 'w';}
        // BUG: PeriodGetTemporalUnit
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    
}
}