import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        LocalDate buggyDate;
        boolean isNotInfected = true;  // Unreachable if-else statement
        if (isNotInfected) {
            buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount
        } else {
            buggyDate = LocalDate.of(1,1,1); // Unreachable code
        }
        return buggyDate;
    }
}