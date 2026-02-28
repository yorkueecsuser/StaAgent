import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.UnsupportedTemporalTypeException;

class TemporalAccessorBugDemo {

    public String showBug() {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        try {
            // BUG: TemporalAccessorGetChronoField
            int year = dayOfWeek.get(ChronoField.YEAR); // This will throw UnsupportedTemporalTypeException
            
            // Unreachable for loop mutation
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This code is unreachable");
            }

            return "Year: " + year;
        } catch (UnsupportedTemporalTypeException e) {
            return "Caught Exception: " + e.toString();
        }
    }

    // Method to simulate a non-final condition for the unreachable loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        TemporalAccessorBugDemo demo = new TemporalAccessorBugDemo();
        System.out.println(demo.showBug());
    }
}