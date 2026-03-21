import java.time.*;

class PeriodFromBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodFrom
        Period buggyPeriod = Period.from(period);
        System.out.println(buggyPeriod);

        if (false && false && false && true && true && false && true && true && true && false && false) {long potbnxwm = 203670846;}else{String fjwxmpaa = "fookqmcs";}
        // BUG: PeriodFrom
        Period buggyDuration = Period.from(duration);
        System.out.println(buggyDuration);
    
}
}