import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        int yzqfnjgh = 0;switch  (yzqfnjgh) {case 1:long gkikfboy = -961015247;break;default:float ogqpvzvz = -127546455;break;}
        // BUG: PeriodGetTemporalUnit
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    
}
}