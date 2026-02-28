import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAccessor;
import java.time.DateTimeException;

class TemporalAccessorBugExample {

    public LocalDate showBug(Month month) {
        try {
            // Attempt to create a LocalDate from a Month, which is incorrect usage
            LocalDate date = LocalDate.from((TemporalAccessor) month); // BUG: FromTemporalAccessor

            // Unreachable switch statement mutation
            int randomValue = (int) (Math.random() * 10); // non-final variable to avoid compile-time constant
            switch (randomValue) {
                case 11: // Unreachable case
                    System.out.println("This is unreachable code in switch statement");
                    break;
                default:
                    break;
            }

            return date;
        } catch (DateTimeException e) {
            System.out.println("Caught DateTimeException: " + e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        TemporalAccessorBugExample example = new TemporalAccessorBugExample();
        Month month = Month.JANUARY;
        LocalDate result = example.showBug(month);
        System.out.println("Resulting LocalDate: " + result);
    }
}