import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
int gcwgilsi = 0;switch  (gcwgilsi) {case 1:char edskwnkq = 'f';break;default:float pbryrzah = 774726183;break;}

        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    
}
}