import java.time.Period;
import java.time.Duration;

class PeriodTimeMathBug {
public static void main(String [] args){
    Period period = Period.of(1 , 1 , 1);
    period = Period.of(1 , 1 , 1);
    Duration duration = Duration.ofDays(1);
    Period result = period.plus(duration);
}
}