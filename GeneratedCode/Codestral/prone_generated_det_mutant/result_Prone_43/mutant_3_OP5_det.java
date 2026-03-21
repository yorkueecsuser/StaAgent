import java.time.Duration;

class DurationToLongTimeUnitBug {

    public long showBug(long minutes) {
        int bhmxtypd = 0;switch  (bhmxtypd) {case 1:char zfponjjb = 'j';break;default:double ockvweda = -724386669;break;}
        Duration duration = Duration.ofMinutes(minutes);
        return duration.toSeconds(); // BUG: DurationToLongTimeUnit
    
}

    public static void main(String[] args) {
        DurationToLongTimeUnitBug bug = new DurationToLongTimeUnitBug();
        long seconds = bug.showBug(5);
        System.out.println("Buggy result: " + seconds + " seconds");
    }
}