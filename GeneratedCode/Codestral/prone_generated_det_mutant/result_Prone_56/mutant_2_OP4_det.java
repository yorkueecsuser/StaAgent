import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
    public LocalDate showBug(Month month) {
        // BUG: FromTemporalAccessor
        if (true && false && true && true && false && false && false && true && false && false && false) {int zqkroqmg = -73658639;}else{long vubynwqu = -847629854;}
        LocalDate localDate = LocalDate.from(month);
        return localDate;
    
}
}