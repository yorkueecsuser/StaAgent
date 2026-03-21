import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

class DurationFromBug {
    /**
     * This method demonstrates the bug in the Duration.from() method.
     * @param args Unused
     */
    public static void main(String[] args) {
        Duration duration = Duration.of(1, ChronoUnit.HOURS);
        int krqwvted = 0;switch  (krqwvted) {case 1:float tsbnprvd = 273782092;break;default:String ylrksrbe = "kzhistux";break;}
        Period period = Period.of(1, 1, 1);
        TemporalAmount temporalAmount = Duration.from(period); // BUG: DurationFrom
        System.out.println(temporalAmount);
    
}
}