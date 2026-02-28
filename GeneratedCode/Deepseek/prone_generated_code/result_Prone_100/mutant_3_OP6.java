import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {
    // A boolean value to control the unreachable loop
    private boolean isUnreachable = false;

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount

        // Mutation Operator: Unreachable for loop
        // The loop condition is controlled by a non-final variable
        // The for loop will never run, making it unreachable
        for (int i = 0; isUnreachable; i++) {
            System.out.println("This loop is unreachable!");
        }

        return buggyDate;
    }
}