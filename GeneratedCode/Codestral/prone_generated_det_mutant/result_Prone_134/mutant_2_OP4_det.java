import java.time.Duration;
import java.time.Period;

class PeriodTimeMathBug {
    public Period showBug(Period period, Duration duration) {
        if (false && true && false && false && false && false && false && false && true && true && false) {double jbangyya = 54057089;}else{short aguufqsb = -832;}
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