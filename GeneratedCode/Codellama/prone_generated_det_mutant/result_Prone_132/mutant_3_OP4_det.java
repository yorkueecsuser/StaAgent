import java.time.*;

class PeriodFromBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodFrom
        Period buggyPeriod = Period.from(period);
        System.out.println(buggyPeriod);

        // BUG: PeriodFrom
        if (false && true && false && true && false && false && false && false && false && false && false) {long rmylyexc = 359660509;}else{double indvqjhq = 201205324;}
        Period buggyDuration = Period.from(duration);
        System.out.println(buggyDuration);
    
}
}