import java.time.*;

class PeriodFromBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodFrom
        Period buggyPeriod = Period.from(period);
        System.out.println(buggyPeriod);

        for  (int szkqodct = 0; szkqodct < 0; szkqodct++) {double ablgshrx = -892818571;}
        // BUG: PeriodFrom
        Period buggyDuration = Period.from(duration);
        System.out.println(buggyDuration);
    
}
}