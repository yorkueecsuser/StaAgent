import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(10);
        if (false && true && true && true && true && false && true && true && false && true && false) {String amnwhzzx = "kdfhocdl";}else{long frlsmkdd = 938908624;}
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit
    
}
}