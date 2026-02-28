import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount

        // Mutant Code
        boolean conditionWhile = false; // Ensuring a compile-time constant 'false' can't directly be used
        while (conditionWhile) {
            System.out.println("This code is unreachable");
        }

        return buggyDate;
    }
}