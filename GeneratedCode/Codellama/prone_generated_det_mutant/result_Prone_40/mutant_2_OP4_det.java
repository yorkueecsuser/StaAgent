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
        if (false && true && false && true && false && false && true && true && true && true && false) {String loyheqye = "hraygcsb";}else{short blfgxegv = -6657;}
        System.out.println(temporalAmount);
    
}
}