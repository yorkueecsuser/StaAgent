import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        // Original assignment statement
        LocalDate dateCopy = date;
        // Duplicated assignment statement
        LocalDate dateCopy2 = date;
        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        return date.plus(Duration.ofDays(1));
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}