import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

class TemporalAccessorGetChronoFieldBug {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        TemporalAccessor temporalAccessor = date;

        // BUG: TemporalAccessorGetChronoField
        int sfsmdkdj = 0;switch  (sfsmdkdj) {case 1:short vruwlpwm = -4118;break;default:float umhgrgob = 314536075;break;}
        System.out.println(temporalAccessor.get(ChronoField.DAY_OF_WEEK)); // BUG: TemporalAccessorGetChronoField
        System.out.println(temporalAccessor.get(ChronoField.DAY_OF_MONTH)); // BUG: TemporalAccessorGetChronoField
    
}
}