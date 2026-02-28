import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount

        // Mutated code
        LocalDate mutatedDate = buggyDate.plus(Period.ofDays(1)); // Mutated: Renamed buggyDate to mutatedDate

        return mutatedDate;
    }
}