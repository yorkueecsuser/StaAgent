import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        LocalDate ybuggyDate = date.plus(Period.ofDays(1)); // Mutated LocalDateTemporalAmount
        return ybuggyDate;
    }
}