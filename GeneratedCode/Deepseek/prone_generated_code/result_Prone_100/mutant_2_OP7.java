import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount
        return buggyDate;
    }

    public void addUnreachableWhileLoop() {
        boolean condition = false; // Unreachable condition
        while (condition) {
            // Unreachable code
            System.out.println("Unreachable code");
        }
    }
}