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

    // Mutated code with renaming of variable 'dayOfWeek' to 'a'
    public int mutatedShowBug() {
        DayOfWeek a = DayOfWeek.MONDAY;
        // Attempting to get MONTH_OF_YEAR from DayOfWeek which is not supported
        int monthOfYear = a.get(ChronoField.MONTH_OF_YEAR); // BUG: TemporalAccessorGetChronoField
        return monthOfYear;
    }

    public static void mutatedMain(String[] args) {
        TemporalAccessorBug bugDemo = new TemporalAccessorBug();
        try {
            bugDemo.mutatedShowBug();
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}