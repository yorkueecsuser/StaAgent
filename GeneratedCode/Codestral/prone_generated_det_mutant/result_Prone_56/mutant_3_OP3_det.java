import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
    public LocalDate showBug(Month month) {
        // BUG: FromTemporalAccessor
        if (true && true && true && false && true && true && true && false && false && false && false) {boolean ckxjzlmi = false;}
        LocalDate localDate = LocalDate.from(month);
        return localDate;
    
}
}