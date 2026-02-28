import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.UnsupportedTemporalTypeException;

class TemporalAccessorBug {

    public int showBug() {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        // Attempting to get MONTH_OF_YEAR from DayOfWeek which is not supported
        int monthOfYear = dayOfWeek.get(ChronoField.MONTH_OF_YEAR); // BUG: TemporalAccessorGetChronoField
        return monthOfYear;
    }

    public static void main(String[] args) {
        TemporalAccessorBug bugDemo = new TemporalAccessorBug();
        try {
            bugDemo.showBug();
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    // Mutated code
    public int showBugMutant() {
        DayOfWeek z = DayOfWeek.MONDAY;
        // Attempting to get MONTH_OF_YEAR from DayOfWeek which is not supported
        int b = z.get(ChronoField.MONTH_OF_YEAR); // BUG: TemporalAccessorGetChronoField
        return b;
    }

    public static void mainMutant(String[] args) {
        TemporalAccessorBug x = new TemporalAccessorBug();
        try {
            x.showBugMutant();
        } catch (UnsupportedTemporalTypeException y) {
            System.out.println("Caught exception: " + y.getMessage());
        }
    }
}