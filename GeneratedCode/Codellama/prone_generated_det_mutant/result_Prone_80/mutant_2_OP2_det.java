import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
public static void main(String [] args){
    Instant instant = Instant.now();
    instant = Instant.now();
    System.out.println(instant.plus(10 , ChronoUnit.MONTHS));
}
}