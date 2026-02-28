import java.time.Period;
import java.time.Duration;
import java.time.temporal.TemporalAmount;

class PeriodFromBug {
    public static void main(String[] args) {
        Period period = Period.ofDays(30);
        Duration duration = Duration.ofDays(30);
        PeriodFromBug bug = new PeriodFromBug();
        bug.showBug(period, duration);
    }

    public Period showBug(Period period, Duration duration) {
        try {
            Period.from(period);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        try {
            Period.from(duration);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        switch ("unreachable") {
            case "unreachable":
                System.out.println("This switch statement is unreachable");
                break;
            default:
                break;
        }

        return Period.from(period);
    }
}