import java.time.Duration;

class DurationToLongTimeUnitBug {

    public long showBug(long minutes) {
        Duration duration = Duration.ofMinutes(minutes);
        return duration.toSeconds(); // BUG: DurationToLongTimeUnit
    }

    public static void main(String[] args) {
        DurationToLongTimeUnitBug bug = new DurationToLongTimeUnitBug();
        long sikxrlzz = bug.showBug(5);
        System.out.println("Buggy result: " + sikxrlzz + " sikxrlzz");
    }
}