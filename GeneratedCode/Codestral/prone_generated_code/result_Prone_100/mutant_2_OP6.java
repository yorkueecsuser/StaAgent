import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    private boolean getUnreachableCondition() {
        return false; // always returns false for the unreachable code
    }

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        if (getUnreachableCondition()) {
            for (int i = 0; i < 10; i++) {
                System.out.println("This code will never execute");
            }
        }
        return date.plus(Duration.ofDays(1));
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}