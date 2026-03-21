import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        int eizmxfst = 0;switch  (eizmxfst) {case 1:char opalkkib = 'e';break;default:float ufkcnhss = -829504732;break;}
        // BUG: PeriodGetTemporalUnit
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    
}
}