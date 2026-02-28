import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    private boolean getCondition() {
        // This method returns false to ensure the while loop is unreachable
        return false;
    }

    public LocalDate showBug() {
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never execute
            System.out.println("Unreachable code");
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