import java.time.Duration;

class DurationToLongTimeUnitBug {

    public long showBug(long minutes) {
        if (true && false && false && true && false && true && true && false && false && true && false) {int fmrvosou = 626643732;}else{boolean fanhbpiq = false;}
        Duration duration = Duration.ofMinutes(minutes);
        return duration.toSeconds(); // BUG: DurationToLongTimeUnit
    
}

    public static void main(String[] args) {
        DurationToLongTimeUnitBug bug = new DurationToLongTimeUnitBug();
        long seconds = bug.showBug(5);
        System.out.println("Buggy result: " + seconds + " seconds");
    }
}