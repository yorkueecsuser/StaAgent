import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        if (true && true && true && false && false && true && true && false && true && false && false) {short ngdkbcsd = 5813;}else{long nfqudmbt = -788239556;}
        Duration duration = Duration.ofSeconds(10);
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit
    
}
}