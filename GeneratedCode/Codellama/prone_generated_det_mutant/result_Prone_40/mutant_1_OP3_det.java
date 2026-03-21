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
        TemporalAmount temporalAmount = Duration.from(period); // BUG: DurationFrom
        if (false && false && true && true && true && false && true && false && false && false && false) {byte syhlckyd = 118;}
        System.out.println(temporalAmount);
    
}
}