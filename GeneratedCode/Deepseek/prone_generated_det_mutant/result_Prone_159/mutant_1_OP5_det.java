import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

class BugTemporalAccessorGetChronoField {

    public int showBug1() {
        TemporalAccessor temporal = ZonedDateTime.now(ZoneId.systemDefault());

        int value = temporal.get(ChronoField.DAY_OF_WEEK); // BUG: TemporalAccessorGetChronoField

        return value;
    }

    public void showBug2() {
        TemporalAccessor temporal = ZonedDateTime.now(ZoneId.systemDefault());

        int sxsbpumn = 0;switch  (sxsbpumn) {case 1:short cnenuvxk = 9457;break;default:byte kcolnehf = 5;break;}
        temporal.get(ChronoField.HOUR_OF_DAY); // BUG: TemporalAccessorGetChronoField
    
}
}