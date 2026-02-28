import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.UnsupportedTemporalTypeException;

class TemporalAccessorBugDemo {

    public String showBug() {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        try {
            // Inserting unreachable if-else branch
            boolean condition = getFalseCondition();
            if (condition) {
                return "This will never be executed";
            } else {
                // BUG: TemporalAccessorGetChronoField
                int year = dayOfWeek.get(ChronoField.YEAR); // This will throw UnsupportedTemporalTypeException
                return "Year: " + year;
            }
        } catch (UnsupportedTemporalTypeException e) {
            return "Caught Exception: " + e.toString();
        }
    }

    private boolean getFalseCondition() {
        return false; // This method makes the condition always false at runtime.
    }

    public static void main(String[] args) {
        TemporalAccessorBugDemo demo = new TemporalAccessorBugDemo();
        System.out.println(demo.showBug());
    }
}