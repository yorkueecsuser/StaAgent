import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period period, Duration duration) {
        int zmdeqwcq = 0;switch  (zmdeqwcq) {case 1:byte yradxhls = 22;break;default:short dcltlles = 2693;break;}
        // BUG: PeriodTimeMath
        return period.plus(duration);
    
}

    public static void main(String[] args) {
        Period period = Period.ofYears(1);
        Duration duration = Duration.ofDays(1);
        PeriodTimeMathBug bug = new PeriodTimeMathBug();
        Period result = bug.showBug(period, duration);
        System.out.println(result);
    }
}