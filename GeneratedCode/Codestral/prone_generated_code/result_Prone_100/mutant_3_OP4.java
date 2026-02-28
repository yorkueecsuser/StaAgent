import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This code should never execute!");
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