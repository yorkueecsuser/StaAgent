import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

class TemporalAccessorGetChronoFieldBug {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        TemporalAccessor temporalAccessor = date;

        // BUG: TemporalAccessorGetChronoField
        System.out.println(temporalAccessor.get(ChronoField.DAY_OF_WEEK)); // BUG: TemporalAccessorGetChronoField
        if (false && false && true && false && true && true && false && false && false && false && false) {boolean oevffzmd = false;}
        System.out.println(temporalAccessor.get(ChronoField.DAY_OF_MONTH)); // BUG: TemporalAccessorGetChronoField
    
}
}