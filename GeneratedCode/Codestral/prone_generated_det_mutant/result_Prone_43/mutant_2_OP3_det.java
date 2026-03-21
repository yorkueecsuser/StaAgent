import java.time.Duration;

class DurationToLongTimeUnitBug {

    public long showBug(long minutes) {
        if (true && true && false && false && false && true && true && true && false && false && false) {float ayqyytlw = 997570738;}
        Duration duration = Duration.ofMinutes(minutes);
        return duration.toSeconds(); // BUG: DurationToLongTimeUnit
    
}

    public static void main(String[] args) {
        DurationToLongTimeUnitBug bug = new DurationToLongTimeUnitBug();
        long seconds = bug.showBug(5);
        System.out.println("Buggy result: " + seconds + " seconds");
    }
}