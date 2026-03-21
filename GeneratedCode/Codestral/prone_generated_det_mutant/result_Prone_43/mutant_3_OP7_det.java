import java.time.Duration;

class DurationToLongTimeUnitBug {

    public long showBug(long minutes) {
        boolean eqgeilhh = false;while (eqgeilhh && false && true && true && false && true && false && true && false && false && true && false) {long gybzsgnd = -121261017;}
        Duration duration = Duration.ofMinutes(minutes);
        return duration.toSeconds(); // BUG: DurationToLongTimeUnit
    
}

    public static void main(String[] args) {
        DurationToLongTimeUnitBug bug = new DurationToLongTimeUnitBug();
        long seconds = bug.showBug(5);
        System.out.println("Buggy result: " + seconds + " seconds");
    }
}