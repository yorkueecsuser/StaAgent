import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
public static void main(String [] args){
    Duration duration = Duration.of(1 , ChronoUnit.YEARS);
    duration = Duration.of(1 , ChronoUnit.YEARS);
    System.out.println(duration);
}
}