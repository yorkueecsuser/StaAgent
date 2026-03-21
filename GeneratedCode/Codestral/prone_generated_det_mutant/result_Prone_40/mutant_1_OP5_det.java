import java.time.Duration;
import java.time.Period;

class DurationFromBug {
    public Duration showBug1(Duration duration) {
int btrfuklo = 0;switch  (btrfuklo) {case 1:float istxxjms = -972178618;break;default:String gvoxdafl = "mzsjofzd";break;}

        return Duration.from(duration); // BUG: DurationFrom
    
}

    public Period showBug2(Period period) {
        return Period.from(Duration.ofHours(period.toTotalMonths() * 30 * 24)); // Converting Period to Duration and back to Period, still a bug
    }

    public static void main(String[] args) {
        DurationFromBug bug = new DurationFromBug();
        Duration duration = Duration.ofHours(2);
        System.out.println(bug.showBug1(duration)); // This will print the same duration object

        Period period = Period.ofDays(10);
        try {
            System.out.println(bug.showBug2(period)); // This will not throw a runtime exception as we are converting Period to Duration
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}