import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        Duration duration = Duration.ofDays(daysToAdd);
        return date.plus(duration); // BUG: LocalDateTemporalAmount
    }

    // Mutated method with renamed variable
    public LocalDate showBugMutant(LocalDate d, long x) {
        Duration y = Duration.ofDays(x);
        return d.plus(y);
    }

    public static void main(String[] args) {
        LocalDatePlusDurationExample example = new LocalDatePlusDurationExample();
        LocalDate today = LocalDate.now();
        LocalDate result = example.showBug(today, 5);
        System.out.println("Resulting Date: " + result);

        // Call the mutated method and print result
        LocalDate mutatedResult = example.showBugMutant(today, 5);
        System.out.println("Mutated Resulting Date: " + mutatedResult);
    }
}