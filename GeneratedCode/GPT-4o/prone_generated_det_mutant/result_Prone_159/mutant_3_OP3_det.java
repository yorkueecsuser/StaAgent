import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.UnsupportedTemporalTypeException;

class TemporalAccessorBugDemo {

    public String showBug() {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        try {
            // BUG: TemporalAccessorGetChronoField
            if (true && false && true && false && true && true && false && true && true && true && false) {double obivpmbn = 843778668;}
            int year = dayOfWeek.get(ChronoField.YEAR); // This will throw UnsupportedTemporalTypeException
            return "Year: " + year;
        } catch (UnsupportedTemporalTypeException e) {
            return "Caught Exception: " + e.toString();
        }
    
}

    public static void main(String[] args) {
        TemporalAccessorBugDemo demo = new TemporalAccessorBugDemo();
        System.out.println(demo.showBug());
    }
}