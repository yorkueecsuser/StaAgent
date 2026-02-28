import java.time.Period;
import java.time.Duration;

class PeriodTimeMathBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodTimeMath
        Period result = period.plus(duration); // Throws DateTimeException

        // Unreachable while loop added
        while(false) {
            System.out.println("This while loop is unreachable");
        }
    }
}