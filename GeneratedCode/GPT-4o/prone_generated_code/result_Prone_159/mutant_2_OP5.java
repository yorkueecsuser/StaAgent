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
            // Insert unreachable switch statement as a mutation
            int unreachableVariable = 1; // This variable is used to show the unreachable switch case
            switch (unreachableVariable) {
                case 0:
                    System.out.println("This is unreachable code.");
                    break;
                default:
                    // No operation, just ensuring the switch statement is included
                    break;
            }
            return "Caught Exception: " + e.toString();
        }
    }

    public static void main(String[] args) {
        TemporalAccessorBugDemo demo = new TemporalAccessorBugDemo();
        System.out.println(demo.showBug());
    }
}