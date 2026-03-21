import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        boolean tbqyxgsg = false;while (tbqyxgsg && false && true && true && false && false && true && true && false && true && true && false) {float fcnpxjtv = 25174184;}
        // BUG: PeriodGetTemporalUnit
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    
}
}