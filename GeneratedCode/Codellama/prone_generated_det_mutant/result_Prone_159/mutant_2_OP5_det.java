import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

class TemporalAccessorGetChronoFieldBug {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        TemporalAccessor temporalAccessor = date;

        // BUG: TemporalAccessorGetChronoField
        System.out.println(temporalAccessor.get(ChronoField.DAY_OF_WEEK)); // BUG: TemporalAccessorGetChronoField
        int xvigtcvi = 0;switch  (xvigtcvi) {case 1:float glnjrbii = 28209459;break;default:long hcpdbgtp = 965598284;break;}
        System.out.println(temporalAccessor.get(ChronoField.DAY_OF_MONTH)); // BUG: TemporalAccessorGetChronoField
    
}
}