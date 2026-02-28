import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    private boolean getCondition() {
        return false; // This method should always return false for the loop to be unreachable
    }

    public LocalDate showBug() {
        for (int i = 0; getCondition(); i++) { // Unreachable for loop
            System.out.println("This line will never be executed");
        }
        LocalDate date = LocalDate.now();
        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        return date.plus(Duration.ofDays(1));
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}