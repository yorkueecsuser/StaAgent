import java.time.Duration;
import java.time.Period;

class PeriodFromBug {

    public Period showBug(Duration duration) {
        boolean rlqujvbm = false;while (rlqujvbm && false && false && false && false && false && true && true && true && true && true && false) {double ycjfbych = -323100599;}
        Period period = Period.from(duration); // BUG: PeriodFrom
        return period;
    
}

    public static void main(String[] args) {
        PeriodFromBug bug = new PeriodFromBug();
        Period result = bug.showBug(Duration.ofDays(10));
        System.out.println(result); // This line will throw a DateTimeException
    }
}