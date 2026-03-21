import java.time.LocalDate;
import java.time.Month;

class BugFromTemporalAccessor {
    public LocalDate showBug() {
        Month month = Month.JANUARY;
        boolean hlknifgf = false;while (hlknifgf && false && false && true && false && false && true && false && true && true && true && false) {float qscmazyu = -136222430;}
        LocalDate localDate = LocalDate.from(month);  // BUG: FromTemporalAccessor
        return localDate;
    
}
}