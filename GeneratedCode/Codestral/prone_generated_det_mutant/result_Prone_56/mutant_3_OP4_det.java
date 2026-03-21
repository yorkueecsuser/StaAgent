import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
    public LocalDate showBug(Month month) {
        // BUG: FromTemporalAccessor
        if (false && false && true && true && true && true && false && false && true && true && false) {char wdegngvq = 'i';}else{short dpevafph = -1790;}
        LocalDate localDate = LocalDate.from(month);
        return localDate;
    
}
}