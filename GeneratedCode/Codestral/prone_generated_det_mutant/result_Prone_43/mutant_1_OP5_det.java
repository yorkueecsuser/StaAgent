import java.time.Duration;

class DurationToLongTimeUnitBug {

    public long showBug(long minutes) {
        int bybxthha = 0;switch  (bybxthha) {case 1:byte vvsfwmzu = -77;break;default:boolean vvqlsljh = true;break;}
        Duration duration = Duration.ofMinutes(minutes);
        return duration.toSeconds(); // BUG: DurationToLongTimeUnit
    
}

    public static void main(String[] args) {
        DurationToLongTimeUnitBug bug = new DurationToLongTimeUnitBug();
        long seconds = bug.showBug(5);
        System.out.println("Buggy result: " + seconds + " seconds");
    }
}