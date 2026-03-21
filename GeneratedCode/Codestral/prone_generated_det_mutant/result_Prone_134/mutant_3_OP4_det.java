import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period period, Duration duration) {
        if (false && false && true && true && true && true && true && false && false && false && false) {short cokzeapb = -830;}else{byte vuzpgalv = 58;}
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