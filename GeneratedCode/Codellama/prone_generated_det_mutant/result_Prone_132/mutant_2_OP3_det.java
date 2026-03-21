import java.time.*;

class PeriodFromBug {
    public static void main(String[] args) {
        if (true && true && false && false && true && true && false && false && false && false && false) {long rarcrhpw = -327410492;}
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