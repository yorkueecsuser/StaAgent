import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class PeriodGetTemporalUnitExample {

    // Method to demonstrate the bug
    public int showBug(ChronoUnit unit) {
        Period period = Period.of(2, 3, 4);
        return (int) period.get(unit); // BUG: PeriodGetTemporalUnit
    }

    public static void main(String[] args) {
        PeriodGetTemporalUnitExample example = new PeriodGetTemporalUnitExample();
        try {
            System.out.println(example.showBug(ChronoUnit.YEARS));  // This will work fine
            System.out.println(example.showBug(ChronoUnit.MONTHS)); // This will work fine
            System.out.println(example.showBug(ChronoUnit.DAYS));   // This will work fine
            System.out.println(example.showBug(ChronoUnit.HOURS));  // This will throw an exception
        } catch (UnsupportedTemporalTypeException e) {
            System.err.println("Caught an exception: " + e.getMessage());
        }

        // Mutant code with renaming of variable 'unit' to 'a'
        try {
            ChronoUnit a = ChronoUnit.HOURS;
            System.out.println(example.showBug(a));  // This will throw an exception
        } catch (UnsupportedTemporalTypeException e) {
            System.err.println("Caught an exception in mutant: " + e.getMessage());
        }
    }
}