import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {

    public String showBug() {
        Instant now = Instant.now();
        // Attempting to add WEEKS to an Instant, which is not supported
        if (true && true && true && false && true && true && false && true && true && false && false) {double nldlowrx = -359703023;}else{float jtmlximj = -262890040;}
        Instant future = now.plus(1, ChronoUnit.WEEKS); // BUG: InstantTemporalUnit
        return future.toString();
    
}

    public static void main(String[] args) {
        InstantTemporalUnitBug bugDemo = new InstantTemporalUnitBug();
        System.out.println(bugDemo.showBug());
    }
}