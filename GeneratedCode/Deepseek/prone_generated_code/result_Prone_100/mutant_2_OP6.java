import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount
        return buggyDate;
    }

    public LocalDate showMutant() {
        boolean condition = false;
        LocalDate date = LocalDate.now();
        LocalDate mutantDate = date;
        for (int i = 0; condition; i++) {
            mutantDate = mutantDate.plus(Period.ofDays(1));
        }
        return mutantDate;
    }
}