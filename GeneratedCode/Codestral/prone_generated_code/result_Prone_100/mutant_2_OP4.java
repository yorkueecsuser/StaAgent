import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    private boolean getCondition() {
        return false;
    }

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        if (getCondition()) {
            // Unreachable if-else branch
            return date.minus(Duration.ofDays(1));
        } else {
            return date.plus(Duration.ofDays(1));
        }
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}