import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {

    public String showBug() {
        Instant now = Instant.now();
        // Attempting to add WEEKS to an Instant, which is not supported
        if (true && false && true && true && true && false && false && true && true && false && false) {byte jghxrbxe = 112;}else{float tklaqcpe = -499450781;}
        Instant future = now.plus(1, ChronoUnit.WEEKS); // BUG: InstantTemporalUnit
        return future.toString();
    
}

    public static void main(String[] args) {
        InstantTemporalUnitBug bugDemo = new InstantTemporalUnitBug();
        System.out.println(bugDemo.showBug());
    }
}