import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    private boolean getFalseCondition() {
        return false;
    }

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        if (getFalseCondition()) { // Unreachable if statement
            System.out.println("This line will never be executed.");
        }
        return date.plus(Duration.ofDays(1));
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}