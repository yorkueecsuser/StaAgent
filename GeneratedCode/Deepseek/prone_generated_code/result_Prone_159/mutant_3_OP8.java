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

        temporal.get(ChronoField.HOUR_OF_DAY); // BUG: TemporalAccessorGetChronoField
    }
}

// Mutated Java code (Renaming operator)

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

class BugTemporalAccessorGetChronoFieldMutated {

    public int showBug1() {
        TemporalAccessor temporal_renamed = ZonedDateTime.now(ZoneId.systemDefault());

        int value = temporal_renamed.get(ChronoField.DAY_OF_WEEK); // BUG: TemporalAccessorGetChronoFieldMutated

        return value;
    }

    public void showBug2() {
        TemporalAccessor temporal_renamed = ZonedDateTime.now(ZoneId.systemDefault());

        temporal_renamed.get(ChronoField.HOUR_OF_DAY); // BUG: TemporalAccessorGetChronoFieldMutated
    }
}