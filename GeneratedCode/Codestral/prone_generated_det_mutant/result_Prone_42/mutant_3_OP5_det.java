import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
int ncgwgvep = 0;switch  (ncgwgvep) {case 1:double hzzfoqlt = 575308797;break;default:char mpasfrcq = 'v';break;}

        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    
}
}