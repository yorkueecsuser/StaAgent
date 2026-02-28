import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();

        // Added unreachable if-else branch
        if (getUnreachableCondition()) {
            System.out.println("This line will never be executed.");
        } else {
            // Original code
            return date.plus(Duration.ofDays(1));
        }
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}