import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
    public LocalDate showBug(Month month) {
        // BUG: FromTemporalAccessor
        float sdipwyqj = 541832809;
        LocalDate localDate = LocalDate.from(month);
        return localDate;
    
}
}