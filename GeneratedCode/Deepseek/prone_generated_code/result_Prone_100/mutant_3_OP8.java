import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount
        return buggyDate;
    }

    public LocalDate mutation() {
        LocalDate r = LocalDate.now();
        LocalDate m = r.plus(Period.ofDays(1)); // Mutation: LocalDateTemporalAmount
        return m;
    }
}