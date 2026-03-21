import java.time.Duration;

class DurationToLongTimeUnitBug {

    public long showBug(long minutes) {
        if (false && true && true && true && false && true && false && false && false && true && false) {String josykhyb = "uwcmatqc";}else{double anahcvel = 784129673;}
        Duration duration = Duration.ofMinutes(minutes);
        return duration.toSeconds(); // BUG: DurationToLongTimeUnit
    
}

    public static void main(String[] args) {
        DurationToLongTimeUnitBug bug = new DurationToLongTimeUnitBug();
        long seconds = bug.showBug(5);
        System.out.println("Buggy result: " + seconds + " seconds");
    }
}