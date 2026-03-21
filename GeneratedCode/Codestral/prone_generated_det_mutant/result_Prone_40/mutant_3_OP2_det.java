import java.time.Duration;
import java.time.Period;

class DurationFromBug {
    public Duration showBug1(Duration duration) {
        return Duration.from(duration); // BUG: DurationFrom
    }

    public Period showBug2(Period period) {
        return Period.from(Duration.ofHours(period.toTotalMonths() * 30 * 24)); // Converting Period to Duration and back to Period, still a bug
    }
public static void main(String [] args){
    DurationFromBug bug = new DurationFromBug();
    Duration duration = Duration.ofHours(2);
    System.out.println(bug.showBug1(duration));
    Period period = Period.ofDays(10);
    period = Period.ofDays(10);
    try { System.out.println(bug.showBug2(period)); } catch(Exception e){ System.out.println("Exception caught: " + e.getMessage()); }
}
}