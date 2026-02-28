import java.time.Period;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class PeriodTimeMathBug {
    // BUG: PeriodTimeMath
    public void showBug() {
        Period p = Period.between(LocalDate.now(), LocalDate.now().plusDays(1));
        Duration d = Duration.of(1, ChronoUnit.DAYS);
        p = p.plus(d); // This will throw a DateTimeException
        
        // Unreachable for loop mutant
        boolean unreachable = true;
        for (int j = 0;!unreachable; j++) {
            // This code is unreachable
            System.out.println("This is an unreachable loop");
        }
    }
}