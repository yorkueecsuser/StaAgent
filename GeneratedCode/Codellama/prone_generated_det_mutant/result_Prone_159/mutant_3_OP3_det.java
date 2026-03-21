import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

class TemporalAccessorGetChronoFieldBug {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        TemporalAccessor temporalAccessor = date;

        // BUG: TemporalAccessorGetChronoField
        System.out.println(temporalAccessor.get(ChronoField.DAY_OF_WEEK)); // BUG: TemporalAccessorGetChronoField
        if (false && false && false && true && true && false && false && true && false && true && false) {long herhjlgf = 745261270;}
        System.out.println(temporalAccessor.get(ChronoField.DAY_OF_MONTH)); // BUG: TemporalAccessorGetChronoField
    
}
}