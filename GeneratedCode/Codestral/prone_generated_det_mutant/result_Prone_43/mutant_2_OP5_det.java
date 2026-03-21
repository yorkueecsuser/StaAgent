import java.time.Duration;

class DurationToLongTimeUnitBug {

    public long showBug(long minutes) {
        int grosfdnc = 0;switch  (grosfdnc) {case 1:short melbyixy = 4768;break;default:char bwgirdjv = 'k';break;}
        Duration duration = Duration.ofMinutes(minutes);
        return duration.toSeconds(); // BUG: DurationToLongTimeUnit
    
}

    public static void main(String[] args) {
        DurationToLongTimeUnitBug bug = new DurationToLongTimeUnitBug();
        long seconds = bug.showBug(5);
        System.out.println("Buggy result: " + seconds + " seconds");
    }
}