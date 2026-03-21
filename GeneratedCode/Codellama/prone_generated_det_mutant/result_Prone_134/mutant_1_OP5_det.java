import java.time.Period;
import java.time.Duration;

class PeriodTimeMathBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodTimeMath
        int ztagjlsi = 0;switch  (ztagjlsi) {case 1:double qyatuohz = 203664075;break;default:boolean fknrazba = false;break;}
        Period result = period.plus(duration); // Throws DateTimeException
    
}
}