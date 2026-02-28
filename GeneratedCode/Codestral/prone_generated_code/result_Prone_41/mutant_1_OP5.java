import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    private static boolean getCondition() {
        return false;
    }

    public Duration showBug(Duration duration) {
        duration.get(ChronoUnit.MINUTES);

        if (getCondition()) {
            int value = 0;
            switch (value) {
                default:
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return duration;
    }

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        Duration duration = Duration.ofSeconds(120);
        bug.showBug(duration);
    }
}