import java.time.LocalDate;
import java.time.Month;

class BugFromTemporalAccessor {
public LocalDate showBug() {
    Month month = Month.JANUARY;
    LocalDate localDate = LocalDate.from(month);
    localDate = LocalDate.from(month);
    return localDate;
}
}