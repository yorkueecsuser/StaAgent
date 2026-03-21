import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
public LocalDate showBug(Month month){
    LocalDate localDate = LocalDate.from(month);
    localDate = LocalDate.from(month);
    return localDate;
}
}