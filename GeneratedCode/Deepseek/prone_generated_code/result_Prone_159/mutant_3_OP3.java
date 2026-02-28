import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

class BugTemporalAccessorGetChronoField {

    boolean condition = false;

    public int showBug1() {
        TemporalAccessor temporal = ZonedDateTime.now(ZoneId.systemDefault());

        int value = temporal.get(ChronoField.DAY_OF_WEEK); 

        if (condition) {
            // This is a mutant, always false
            // Added by Mutation Testing
            value = 0;
        }

        return value;
    }

    public void showBug2() {
        TemporalAccessor temporal = ZonedDateTime.now(ZoneId.systemDefault());

        temporal.get(ChronoField.HOUR_OF_DAY); 

        if (condition) {
            // This is a mutant, always false
            // Added by Mutation Testing
            System.out.println("This code is unreachable");
        }
    }
}