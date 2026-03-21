import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
    public LocalDate showBug(Month month) {
        // BUG: FromTemporalAccessor
        byte ayulesyq = -114;
        LocalDate localDate = LocalDate.from(month);
        return localDate;
    
}
}