import java.time.LocalDate;
import java.time.Month;

class BugFromTemporalAccessor {
    public LocalDate showBug() {
        Month month = Month.JANUARY;
        if (false && true && true && true && true && false && false && true && false && false && false) {int fvubwmfq = -281813607;}
        LocalDate localDate = LocalDate.from(month);  // BUG: FromTemporalAccessor
        return localDate;
    
}
}