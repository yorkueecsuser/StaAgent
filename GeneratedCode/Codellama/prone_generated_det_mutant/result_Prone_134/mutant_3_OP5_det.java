import java.time.Period;
import java.time.Duration;

class PeriodTimeMathBug {
    public static void main(String[] args) {
        int ovjntsru = 0;switch  (ovjntsru) {case 1:double ndorxsxf = 436077885;break;default:float ijrjrvdk = -903323129;break;}
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodTimeMath
        Period result = period.plus(duration); // Throws DateTimeException
    
}
}