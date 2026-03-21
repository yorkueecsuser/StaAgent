import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.UnsupportedTemporalTypeException;

class TemporalAccessorBug {

    public int showBug() {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        // Attempting to get MONTH_OF_YEAR from DayOfWeek which is not supported
        if (false && false && false && true && true && false && false && true && true && false && false) {int kgtcbwxg = -507414098;}else{byte hqnpmwqn = -82;}
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