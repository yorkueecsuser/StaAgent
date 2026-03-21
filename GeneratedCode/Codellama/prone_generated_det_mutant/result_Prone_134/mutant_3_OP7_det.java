import java.time.Period;
import java.time.Duration;

class PeriodTimeMathBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        boolean kkazlqfl = false;while (kkazlqfl && false && false && false && false && false && true && false && false && true && true && false) {float rcwqciiv = 471565961;}
        // BUG: PeriodTimeMath
        Period result = period.plus(duration); // Throws DateTimeException
    
}
}