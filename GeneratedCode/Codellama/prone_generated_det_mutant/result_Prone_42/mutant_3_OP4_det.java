import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        if (true && false && true && false && true && false && false && true && true && true && false) {byte pvrnafpf = -87;}else{double hsabnxqp = -452149116;}
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        System.out.println(duration);
    
}
}