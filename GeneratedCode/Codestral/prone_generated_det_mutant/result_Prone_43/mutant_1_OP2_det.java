import java.time.Duration;

class DurationToLongTimeUnitBug {
public long showBug(long minutes){
    Duration duration = Duration.ofMinutes(minutes);
    duration = Duration.ofMinutes(minutes);
    return duration.toSeconds();
}

    public static void main(String[] args) {
        DurationToLongTimeUnitBug bug = new DurationToLongTimeUnitBug();
        long seconds = bug.showBug(5);
        System.out.println("Buggy result: " + seconds + " seconds");
    }
}