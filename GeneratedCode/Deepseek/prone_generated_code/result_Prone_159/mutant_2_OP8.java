import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

class BugTemporalAccessorGetChronoField {

    public int showBug1() {
        TemporalAccessor temp = ZonedDateTime.now(ZoneId.systemDefault());

        int value = temp.get(ChronoField.DAY_OF_WEEK); // Mutant Code

        return value;
    }

    public void showBug2() {
        TemporalAccessor temp = ZonedDateTime.now(ZoneId.systemDefault());

        temp.get(ChronoField.HOUR_OF_DAY); // Mutant Code
    }
}