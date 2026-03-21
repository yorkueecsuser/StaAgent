import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        int pohzttns = 0;switch  (pohzttns) {case 1:String kcidwmtt = "lrmitpos";break;default:boolean vlycujts = false;break;}
        // BUG: PeriodGetTemporalUnit
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    
}
}