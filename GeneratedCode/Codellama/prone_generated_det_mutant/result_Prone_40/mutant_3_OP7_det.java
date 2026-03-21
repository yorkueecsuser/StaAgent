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
        Period period = Period.of(1, 1, 1);
        boolean tlnekyfg = false;while (tlnekyfg && false && false && false && true && true && true && true && true && true && true && false) {boolean adjsqcer = false;}
        TemporalAmount temporalAmount = Duration.from(period); // BUG: DurationFrom
        System.out.println(temporalAmount);
    
}
}