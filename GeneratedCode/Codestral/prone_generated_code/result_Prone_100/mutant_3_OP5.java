import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    private boolean getFalseCondition() {
        return false;
    }

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();

        // Adding an unreachable switch statement
        boolean falseCondition = getFalseCondition();
        int value = 0;
        if (falseCondition) {
            value = 1;
        }
        switch(value) {
            case 1:
                System.out.println("This code will never execute.");
                break;
            default:
                break;
        }

        // Original bugged code
        return date.plus(Duration.ofDays(1));
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}