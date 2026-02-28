import java.time.Duration;
import java.time.LocalDate;
import java.util.Random;

class LocalDateBug {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        // Dead store mutation: An unused integer variable
        int unusedVariable = new Random().nextInt();
        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        return date.plus(Duration.ofDays(1));
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}