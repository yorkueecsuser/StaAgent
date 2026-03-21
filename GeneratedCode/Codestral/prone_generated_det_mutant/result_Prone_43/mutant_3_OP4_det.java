import java.time.Duration;

class DurationToLongTimeUnitBug {

    public long showBug(long minutes) {
        if (false && true && true && false && false && true && true && false && false && false && false) {int wfmgiyth = -373989183;}else{boolean xfgzepjl = true;}
        Duration duration = Duration.ofMinutes(minutes);
        return duration.toSeconds(); // BUG: DurationToLongTimeUnit
    
}

    public static void main(String[] args) {
        DurationToLongTimeUnitBug bug = new DurationToLongTimeUnitBug();
        long seconds = bug.showBug(5);
        System.out.println("Buggy result: " + seconds + " seconds");
    }
}