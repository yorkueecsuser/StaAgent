import java.time.Duration;

class DurationToLongTimeUnitBug {

    public long showBug(long minutes) {
        boolean kopkxnnq = false;while (kopkxnnq && true && false && false && true && true && true && true && false && false && false && false) {char wvncwunc = 't';}
        Duration duration = Duration.ofMinutes(minutes);
        return duration.toSeconds(); // BUG: DurationToLongTimeUnit
    
}

    public static void main(String[] args) {
        DurationToLongTimeUnitBug bug = new DurationToLongTimeUnitBug();
        long seconds = bug.showBug(5);
        System.out.println("Buggy result: " + seconds + " seconds");
    }
}