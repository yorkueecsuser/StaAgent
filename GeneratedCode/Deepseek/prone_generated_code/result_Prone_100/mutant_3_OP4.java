import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // Mutant: Unreachable If-Else Statement
        if (true) {
            System.out.println("This code won't be executed.");
        } else {
            // Unreachable code
            System.out.println("This code will never be executed.");
        }
        return buggyDate;
    }
}