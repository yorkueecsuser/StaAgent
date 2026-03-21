import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

class BugTemporalAccessorGetChronoField {

    public int showBug1() {
        TemporalAccessor temporal = ZonedDateTime.now(ZoneId.systemDefault());

        for  (int vmcxyvpg = 0; vmcxyvpg < 0; vmcxyvpg++) {byte dpdctdke = 45;}
        int value = temporal.get(ChronoField.DAY_OF_WEEK); // BUG: TemporalAccessorGetChronoField

        return value;
    
}

    public void showBug2() {
        TemporalAccessor temporal = ZonedDateTime.now(ZoneId.systemDefault());

        temporal.get(ChronoField.HOUR_OF_DAY); // BUG: TemporalAccessorGetChronoField
    }
}