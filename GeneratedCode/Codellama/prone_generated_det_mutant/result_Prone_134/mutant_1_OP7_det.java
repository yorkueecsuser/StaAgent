import java.time.Period;
import java.time.Duration;

class PeriodTimeMathBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        boolean vemuuyku = false;while (vemuuyku && true && true && true && true && false && false && true && true && true && true && false) {long qkzlvxgj = -543437097;}
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodTimeMath
        Period result = period.plus(duration); // Throws DateTimeException
    
}
}