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
            int unreachableSwitchCondition = getUnreachableCondition();
            switch (unreachableSwitchCondition) {
                case 1:
                    return "Unreachable case 1";
                case 2: 
                    return "Unreachable case 2";
                default:
                    // This is the reachable path
                    return "Caught Exception: " + e.toString();
            }
        }
    }

    private int getUnreachableCondition() {
        return -1;  // Set to a value that doesn't match any case
    }

    public static void main(String[] args) {
        TemporalAccessorBugDemo demo = new TemporalAccessorBugDemo();
        System.out.println(demo.showBug());
    }
}