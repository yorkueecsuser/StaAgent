import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.UnsupportedTemporalTypeException;

class TemporalAccessorBug {
public int showBug() {
    DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
    dayOfWeek = DayOfWeek.MONDAY;
    int monthOfYear = dayOfWeek.get(ChronoField.MONTH_OF_YEAR);
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