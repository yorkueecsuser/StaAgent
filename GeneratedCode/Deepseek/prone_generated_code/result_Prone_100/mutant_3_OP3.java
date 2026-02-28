import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount
        if (false) {
            buggyDate = date.plus(Period.ofDays(0)); // Mutant code
        }
        return buggyDate;
    }
}