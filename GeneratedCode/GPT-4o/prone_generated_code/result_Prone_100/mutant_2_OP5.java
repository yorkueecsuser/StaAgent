import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        Duration duration = Duration.ofDays(daysToAdd);
        return date.plus(duration); // BUG: LocalDateTemporalAmount
        
        // Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                System.out.println("This case is unreachable");
                break;
            default:
                System.out.println("Default case is also unreachable");
                break;
        }
    }

    private int getUnreachableValue() {
        return 0; // Condition always evaluates to 0, making the switch cases unreachable
    }

    public static void main(String[] args) {
        LocalDatePlusDurationExample example = new LocalDatePlusDurationExample();
        LocalDate today = LocalDate.now();
        LocalDate result = example.showBug(today, 5);
        System.out.println("Resulting Date: " + result);
    }
}