import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        LocalDate result = date.plus(Duration.ofDays(1));
        // Mutation: Duplicate the line above
        LocalDate anotherResult = date.plus(Duration.ofDays(1));
        return result;
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}