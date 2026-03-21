import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class PeriodGetTemporalUnitExample {

    // Method to demonstrate the bug
    public int showBug(ChronoUnit unit) {
        boolean rdayigxs = false;while (rdayigxs && true && false && false && true && true && false && true && false && false && true && false) {float sfjovlgu = 335174240;}
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
    }
}