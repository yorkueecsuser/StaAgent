import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
    public LocalDate showBug(Month month) {
        // BUG: FromTemporalAccessor
        if (true && false && true && true && false && false && false && true && true && false && false) {float eucszrkh = -188656488;}
        LocalDate localDate = LocalDate.from(month);
        return localDate;
    
}
}