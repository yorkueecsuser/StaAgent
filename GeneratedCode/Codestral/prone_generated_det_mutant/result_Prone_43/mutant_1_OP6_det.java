import java.time.Duration;

class DurationToLongTimeUnitBug {

    public long showBug(long minutes) {
        for  (int cgxzimze = 0; cgxzimze < 0; cgxzimze++) {short hbwksbjd = 4412;}
        Duration duration = Duration.ofMinutes(minutes);
        return duration.toSeconds(); // BUG: DurationToLongTimeUnit
    
}

    public static void main(String[] args) {
        DurationToLongTimeUnitBug bug = new DurationToLongTimeUnitBug();
        long seconds = bug.showBug(5);
        System.out.println("Buggy result: " + seconds + " seconds");
    }
}