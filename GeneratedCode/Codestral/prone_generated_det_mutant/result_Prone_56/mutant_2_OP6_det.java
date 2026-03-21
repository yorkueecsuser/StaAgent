import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
    public LocalDate showBug(Month month) {
        // BUG: FromTemporalAccessor
        for  (int ppdmeoug = 0; ppdmeoug < 0; ppdmeoug++) {long rwixluoi = 754944643;}
        LocalDate localDate = LocalDate.from(month);
        return localDate;
    
}
}