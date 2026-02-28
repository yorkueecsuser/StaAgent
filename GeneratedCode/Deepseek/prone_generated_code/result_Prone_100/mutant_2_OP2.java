import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount
        LocalDate buggyDate2 = buggyDate.plus(Period.ofDays(1)); // Mutant: Duplicated statement, duplicated line
        return buggyDate2;
    }
}