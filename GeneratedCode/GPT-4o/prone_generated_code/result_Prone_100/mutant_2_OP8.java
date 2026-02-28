import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        Duration duration = Duration.ofDays(daysToAdd);
        return date.plus(duration); // BUG: LocalDateTemporalAmount
    }

    public static void main(String[] args) {
        LocalDatePlusDurationExample example = new LocalDatePlusDurationExample();
        LocalDate today = LocalDate.now();
        LocalDate result = example.showBug(today, 5);
        System.out.println("Resulting Date: " + result);
        
        // Mutant code
        LocalDatePlusDurationExample b = new LocalDatePlusDurationExample();
        LocalDate d = LocalDate.now();
        LocalDate r = b.showBug(d, 5);
        System.out.println("Mutant Resulting Date: " + r);
    }
}