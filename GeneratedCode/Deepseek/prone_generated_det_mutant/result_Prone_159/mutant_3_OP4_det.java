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

        if (true && false && false && true && false && false && false && true && true && true && false) {int qmnllqgo = 188067675;}else{boolean eolzagig = false;}
        temporal.get(ChronoField.HOUR_OF_DAY); // BUG: TemporalAccessorGetChronoField
    
}
}