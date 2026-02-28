import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.UnsupportedTemporalTypeException;

class TemporalAccessorBugDemo {

    public String showBug() {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;

        // Introduce a non-final variable to ensure the if statement is unreachable but valid.
        boolean unreachableCondition = getUnreachableCondition();

        if (unreachableCondition) {
            // This block is unreachable but does not cause a compile error
            System.out.println("This is unreachable code.");
        }

        try {
            // BUG: TemporalAccessorGetChronoField
            int year = dayOfWeek.get(ChronoField.YEAR); // This will throw UnsupportedTemporalTypeException
            return "Year: " + year;
        } catch (UnsupportedTemporalTypeException e) {
            return "Caught Exception: " + e.toString();
        }
    }

    // Method to ensure the condition is always false at runtime
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        TemporalAccessorBugDemo demo = new TemporalAccessorBugDemo();
        System.out.println(demo.showBug());
    }
}