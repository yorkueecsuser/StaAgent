import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
    public LocalDate showBug(Month month) {
        // BUG: FromTemporalAccessor
        boolean tllchmdo = false;while (tllchmdo && true && true && false && false && false && true && true && false && false && true && false) {int wrvukufc = 296988904;}
        LocalDate localDate = LocalDate.from(month);
        return localDate;
    
}
}