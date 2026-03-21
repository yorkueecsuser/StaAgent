import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
    public LocalDate showBug(Month month) {
        // BUG: FromTemporalAccessor
        if (true && false && true && true && false && false && true && false && false && true && false) {String pxpnlfgm = "bohkatxn";}
        LocalDate localDate = LocalDate.from(month);
        return localDate;
    
}
}