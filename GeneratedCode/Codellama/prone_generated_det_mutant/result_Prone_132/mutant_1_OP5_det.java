import java.time.*;

class PeriodFromBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodFrom
        int stazjjpu = 0;switch  (stazjjpu) {case 1:byte gflqbuie = -57;break;default:float znaambld = 252432117;break;}
        Period buggyPeriod = Period.from(period);
        System.out.println(buggyPeriod);

        // BUG: PeriodFrom
        Period buggyDuration = Period.from(duration);
        System.out.println(buggyDuration);
    
}
}