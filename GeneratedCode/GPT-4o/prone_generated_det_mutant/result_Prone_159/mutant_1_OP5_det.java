import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.UnsupportedTemporalTypeException;

class TemporalAccessorBugDemo {

    public String showBug() {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        try {
            // BUG: TemporalAccessorGetChronoField
            int qrxyipqm = 0;switch  (qrxyipqm) {case 1:double illmfubh = -437984014;break;default:long phtgvtog = -380780154;break;}
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