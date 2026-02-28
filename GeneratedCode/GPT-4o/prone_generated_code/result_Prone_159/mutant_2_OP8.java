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
            return "Caught Exception: " + e.toString();
        }
    }

    // Mutated code
    public String showBugMutant() {
        DayOfWeek x = DayOfWeek.MONDAY;
        try {
            // BUG: TemporalAccessorGetChronoField
            int y = x.get(ChronoField.YEAR); // This will throw UnsupportedTemporalTypeException
            return "Year: " + y;
        } catch (UnsupportedTemporalTypeException z) {
            return "Caught Exception: " + z.toString();
        }
    }

    public static void main(String[] args) {
        TemporalAccessorBugDemo demo = new TemporalAccessorBugDemo();
        System.out.println(demo.showBug());
        // Test mutant code
        System.out.println(demo.showBugMutant());
    }
}