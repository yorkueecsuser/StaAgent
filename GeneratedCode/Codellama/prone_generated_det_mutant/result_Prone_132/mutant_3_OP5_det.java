import java.time.*;

class PeriodFromBug {
    public static void main(String[] args) {
        int vczorwii = 0;switch  (vczorwii) {case 1:int wonxdxpj = 238735044;break;default:double hjofvjwh = 438545250;break;}
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodFrom
        Period buggyPeriod = Period.from(period);
        System.out.println(buggyPeriod);

        // BUG: PeriodFrom
        Period buggyDuration = Period.from(duration);
        System.out.println(buggyDuration);
    
}
}