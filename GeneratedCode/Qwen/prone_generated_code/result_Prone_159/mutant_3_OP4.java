import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.UnsupportedTemporalTypeException;

class TemporalAccessorBug {

    public int showBug() {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        // Attempting to get MONTH_OF_YEAR from DayOfWeek which is not supported
        int monthOfYear = dayOfWeek.get(ChronoField.MONTH_OF_YEAR); // BUG: TemporalAccessorGetChronoField

        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            monthOfYear = 0;
        } else {
            // This block also should never execute due to the nature of getCondition()
            monthOfYear = -1;
        }

        return monthOfYear;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        TemporalAccessorBug bugDemo = new TemporalAccessorBug();
        try {
            bugDemo.showBug();
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}