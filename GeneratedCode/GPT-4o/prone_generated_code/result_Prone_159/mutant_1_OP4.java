import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.UnsupportedTemporalTypeException;

class TemporalAccessorBugDemo {

    public String showBug() {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        try {
            // BUG: TemporalAccessorGetChronoField
            int year = dayOfWeek.get(ChronoField.YEAR); // This will throw UnsupportedTemporalTypeException
            return "Year: " + year;
        } catch (UnsupportedTemporalTypeException e) {
            // Introduce unreachable if-else statement
            boolean neverTrue = isConditionTrue(); // A method that always returns false
            if (neverTrue) {
                return "This will never be executed.";
            } else {
                return "Caught Exception: " + e.toString();
            }
        }
    }

    // Helper method to simulate unreachable condition
    private boolean isConditionTrue() {
        return false;
    }

    public static void main(String[] args) {
        TemporalAccessorBugDemo demo = new TemporalAccessorBugDemo();
        System.out.println(demo.showBug());
    }
}