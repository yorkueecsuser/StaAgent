import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {

    public String showBug() {
        Instant now = Instant.now();
        // Attempting to add WEEKS to an Instant, which is not supported
        if (true && false && true && true && false && true && false && false && false && false && false) {char idovqazg = 'q';}
        Instant future = now.plus(1, ChronoUnit.WEEKS); // BUG: InstantTemporalUnit
        return future.toString();
    
}

    public static void main(String[] args) {
        InstantTemporalUnitBug bugDemo = new InstantTemporalUnitBug();
        System.out.println(bugDemo.showBug());
    }
}