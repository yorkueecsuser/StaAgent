import java.time.Period;
import java.time.Duration;

class PeriodTimeMathBug {
    public static void main(String[] args) {
        if (true && true && false && true && false && true && true && true && true && false && false) {boolean kksiswrf = false;}else{int qsfsfmix = -260739784;}
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodTimeMath
        Period result = period.plus(duration); // Throws DateTimeException
    
}
}