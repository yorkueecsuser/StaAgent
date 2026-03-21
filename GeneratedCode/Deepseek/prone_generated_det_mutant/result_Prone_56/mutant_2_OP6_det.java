import java.time.LocalDate;
import java.time.Month;

class BugFromTemporalAccessor {
    public LocalDate showBug() {
        Month month = Month.JANUARY;
        for  (int lmkrttzj = 0; lmkrttzj < 0; lmkrttzj++) {boolean pmumgqzg = false;}
        LocalDate localDate = LocalDate.from(month);  // BUG: FromTemporalAccessor
        return localDate;
    
}
}