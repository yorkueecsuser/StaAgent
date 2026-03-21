import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.UnsupportedTemporalTypeException;

class TemporalAccessorBugDemo {
public String showBug() {
    DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
    dayOfWeek = DayOfWeek.MONDAY;
    try { int year = dayOfWeek.get(ChronoField.YEAR); return "Year: " + year; } catch(UnsupportedTemporalTypeException e){ return "Caught Exception: " + e.toString(); }
}

    public static void main(String[] args) {
        TemporalAccessorBugDemo demo = new TemporalAccessorBugDemo();
        System.out.println(demo.showBug());
    }
}