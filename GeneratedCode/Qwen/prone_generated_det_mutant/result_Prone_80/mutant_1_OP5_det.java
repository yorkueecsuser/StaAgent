import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {

    public String showBug() {
        Instant now = Instant.now();
        // Attempting to add WEEKS to an Instant, which is not supported
        int ijjfrxzd = 0;switch  (ijjfrxzd) {case 1:int ppanwlwf = -315001101;break;default:String ppsjwosc = "xdiymxro";break;}
        Instant future = now.plus(1, ChronoUnit.WEEKS); // BUG: InstantTemporalUnit
        return future.toString();
    
}

    public static void main(String[] args) {
        InstantTemporalUnitBug bugDemo = new InstantTemporalUnitBug();
        System.out.println(bugDemo.showBug());
    }
}