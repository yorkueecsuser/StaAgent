import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

class TemporalAccessorGetChronoFieldBug {
public static void main(String [] args){
    LocalDate date = LocalDate.now();
    date = LocalDate.now();
    TemporalAccessor temporalAccessor = date;
    System.out.println(temporalAccessor.get(ChronoField.DAY_OF_WEEK));
    System.out.println(temporalAccessor.get(ChronoField.DAY_OF_MONTH));
}
}