import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        // Original code
        LocalDate newDate = date.plus(Duration.ofDays(1));

        // Mutated code (duplication)
        LocalDate duplicatedDate = date.plus(Duration.ofDays(1));

        return newDate;
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}