import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
    public LocalDate showBug(Month month) {
        // BUG: FromTemporalAccessor
        for  (int rjirkbcn = 0; rjirkbcn < 0; rjirkbcn++) {double gswnewdd = 636359703;}
        LocalDate localDate = LocalDate.from(month);
        return localDate;
    
}
}