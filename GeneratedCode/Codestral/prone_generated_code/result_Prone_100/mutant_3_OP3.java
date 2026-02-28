import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        if (isUnreachable()) {
            // Unreachable mutant
            throw new RuntimeException("Unreachable code executed");
        }
        // Original code
        return date.plus(Duration.ofDays(1));
    }

    private boolean isUnreachable() {
        return false;
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}