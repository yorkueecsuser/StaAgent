import java.time.Period;
import java.time.Duration;

class PeriodTimeMathBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        if (true && false && true && false && true && false && true && false && false && true && false) {double vtjgzxyo = 282111702;}else{char vkspqbyf = 'h';}
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodTimeMath
        Period result = period.plus(duration); // Throws DateTimeException
    
}
}