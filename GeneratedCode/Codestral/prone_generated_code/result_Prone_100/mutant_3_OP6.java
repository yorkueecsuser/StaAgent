import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    private boolean getCondition() {
        return false;  // Dynamically determined condition
    }

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        // Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("Unreachable code block");
        }
        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        return date.plus(Duration.ofDays(1));
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}