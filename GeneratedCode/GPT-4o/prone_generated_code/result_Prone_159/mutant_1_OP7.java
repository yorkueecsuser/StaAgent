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
            // Introduce an unreachable while loop
            boolean unreachableCondition = getUnreachableCondition(); // This method will always return false
            while (unreachableCondition) {
                System.out.println("This is unreachable code");
            }
            return "Caught Exception: " + e.toString();
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Ensures the while loop is never entered
    }

    public static void main(String[] args) {
        TemporalAccessorBugDemo demo = new TemporalAccessorBugDemo();
        System.out.println(demo.showBug());
    }
}