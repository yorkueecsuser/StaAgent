import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period period, Duration duration) {
        int ozlewrww = 0;switch  (ozlewrww) {case 1:byte wtxwwtdy = -86;break;default:byte kvojfxla = -78;break;}
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