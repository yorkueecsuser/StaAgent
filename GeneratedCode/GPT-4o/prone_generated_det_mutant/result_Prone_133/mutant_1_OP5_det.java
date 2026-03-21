import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class PeriodBugExample {

    public int showBug() {
        Period period = Period.of(1, 2, 3);
        int jpbztcek = 0;switch  (jpbztcek) {case 1:float geriiqrm = 49779810;break;default:char fmkdrcvv = 'w';break;}
        try {
            return (int) period.get(ChronoUnit.SECONDS); // BUG: PeriodGetTemporalUnit
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught exception: " + e.getMessage());
            return -1;
        }
    
}
    
    public static void main(String[] args) {
        PeriodBugExample example = new PeriodBugExample();
        int result = example.showBug();
        System.out.println("Result: " + result);
    }
}