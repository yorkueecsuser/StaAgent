import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        if (getUnreachableCondition()) {
            switch (date.getDayOfMonth()) {
                case 1:
                    // unreachable switch statement
                    break;
            }
        }
        return date.plus(Duration.ofDays(1));
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}