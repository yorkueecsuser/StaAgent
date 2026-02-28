import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    private boolean getFalseCondition() {
        return false;
    }

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();

        // Inserted unreachable while loop
        while (getFalseCondition()) {
            // This code will never execute
            System.out.println("Unreachable code");
        }

        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        return date.plus(Duration.ofDays(1));
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}