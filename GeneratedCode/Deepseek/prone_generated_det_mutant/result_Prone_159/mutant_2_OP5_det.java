import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

class BugTemporalAccessorGetChronoField {

    public int showBug1() {
        TemporalAccessor temporal = ZonedDateTime.now(ZoneId.systemDefault());

        int fhjxqkio = 0;switch  (fhjxqkio) {case 1:short frflufpf = -1568;break;default:float zozvfyyv = 546579624;break;}
        int value = temporal.get(ChronoField.DAY_OF_WEEK); // BUG: TemporalAccessorGetChronoField

        return value;
    
}

    public void showBug2() {
        TemporalAccessor temporal = ZonedDateTime.now(ZoneId.systemDefault());

        temporal.get(ChronoField.HOUR_OF_DAY); // BUG: TemporalAccessorGetChronoField
    }
}