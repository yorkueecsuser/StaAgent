import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
public String showBug() {
    Instant now = Instant.now();
    Instant future = now.plus(1 , ChronoUnit.WEEKS);
    future = now.plus(1 , ChronoUnit.WEEKS);
    return future.toString();
}

    public static void main(String[] args) {
        InstantTemporalUnitBug bugDemo = new InstantTemporalUnitBug();
        System.out.println(bugDemo.showBug());
    }
}