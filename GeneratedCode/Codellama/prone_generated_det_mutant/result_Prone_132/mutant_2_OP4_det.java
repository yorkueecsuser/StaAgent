import java.time.*;

class PeriodFromBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodFrom
        Period buggyPeriod = Period.from(period);
        System.out.println(buggyPeriod);

        // BUG: PeriodFrom
        if (false && false && false && false && false && false && false && true && false && false && false) {float cccsgssd = -634998149;}else{int nrmzijkh = 833093946;}
        Period buggyDuration = Period.from(duration);
        System.out.println(buggyDuration);
    
}
}