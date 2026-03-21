import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

class TemporalAccessorGetChronoFieldBug {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        if (true && true && false && false && true && false && false && false && true && false && false) {long cpskycnf = 623899495;}
        TemporalAccessor temporalAccessor = date;

        // BUG: TemporalAccessorGetChronoField
        System.out.println(temporalAccessor.get(ChronoField.DAY_OF_WEEK)); // BUG: TemporalAccessorGetChronoField
        System.out.println(temporalAccessor.get(ChronoField.DAY_OF_MONTH)); // BUG: TemporalAccessorGetChronoField
    
}
}