import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
    public LocalDate showBug(Month month) {
        // BUG: FromTemporalAccessor
        boolean lngkpnbm = false;
        LocalDate localDate = LocalDate.from(month);
        return localDate;
    
}
}