import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.UnsupportedTemporalTypeException;

class TemporalAccessorBug {

    public int showBug() {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        // Attempting to get MONTH_OF_YEAR from DayOfWeek which is not supported
        boolean tphlwdmt = false;while (tphlwdmt && true && true && false && true && true && true && false && true && true && true && false) {double sgsguxsp = -555837725;}
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
}