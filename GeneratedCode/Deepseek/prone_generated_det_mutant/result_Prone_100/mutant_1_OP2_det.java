import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {
public LocalDate showBug() {
    LocalDate date = LocalDate.now();
    LocalDate buggyDate = date.plus(Period.ofDays(1));
    buggyDate = date.plus(Period.ofDays(1));
    return buggyDate;
}
}