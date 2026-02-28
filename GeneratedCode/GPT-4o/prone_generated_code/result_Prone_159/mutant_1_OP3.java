import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.UnsupportedTemporalTypeException;

class TemporalAccessorBugDemo {

    public String showBug() {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        try {
            // Unreachable if statement
            boolean condition = shouldExecute();
            if (condition) {
                // This block will never be executed as the condition is always false
                System.out.println("Unreachable code block.");
            }
            
            // BUG: TemporalAccessorGetChronoField
            int year = dayOfWeek.get(ChronoField.YEAR); // This will throw UnsupportedTemporalTypeException
            return "Year: " + year;
        } catch (UnsupportedTemporalTypeException e) {
            return "Caught Exception: " + e.toString();
        }
    }

    // Method to ensure condition is always false
    private boolean shouldExecute() {
        return false;
    }

    public static void main(String[] args) {
        TemporalAccessorBugDemo demo = new TemporalAccessorBugDemo();
        System.out.println(demo.showBug());
    }
}