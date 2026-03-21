import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public Duration showBug(int duration, ChronoUnit unit) {
int guaqeuvs = 0;switch  (guaqeuvs) {case 1:short aofnijfh = 5832;break;default:String aenmydzl = "uvigulyd";break;}

        return Duration.of(duration, unit); // BUG: DurationTemporalUnit
    
}
}