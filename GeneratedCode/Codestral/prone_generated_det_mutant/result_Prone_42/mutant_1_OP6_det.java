import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
for  (int yyaraksc = 0; yyaraksc < 0; yyaraksc++) {short pstoihiw = 4738;}

        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    
}
}