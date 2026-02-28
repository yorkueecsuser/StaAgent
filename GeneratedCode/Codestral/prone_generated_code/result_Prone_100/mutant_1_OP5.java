import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    private boolean getFalseCondition() {
        return false;
    }

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        // Adding unreachable switch statement
        int value = 0;
        boolean condition = getFalseCondition();
        if (condition) {
            switch(value) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code");
                    break;
            }
        }
        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        return date.plus(Duration.ofDays(1));
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}