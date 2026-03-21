import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
    public LocalDate showBug(Month month) {
        // BUG: FromTemporalAccessor
        if (true && false && false && true && false && true && true && false && false && false && false) {byte qvksajjv = 53;}else{int uaaqapom = 321098029;}
        LocalDate localDate = LocalDate.from(month);
        return localDate;
    
}
}