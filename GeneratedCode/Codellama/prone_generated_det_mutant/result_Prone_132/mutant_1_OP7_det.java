import java.time.*;

class PeriodFromBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        boolean crjafunv = false;while (crjafunv && true && true && false && true && true && false && false && true && true && false && false) {char vmseljui = 'p';}
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodFrom
        Period buggyPeriod = Period.from(period);
        System.out.println(buggyPeriod);

        // BUG: PeriodFrom
        Period buggyDuration = Period.from(duration);
        System.out.println(buggyDuration);
    
}
}