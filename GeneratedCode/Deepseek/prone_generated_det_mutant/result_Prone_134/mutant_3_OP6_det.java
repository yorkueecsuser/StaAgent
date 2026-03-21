import java.time.Period;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class PeriodTimeMathBug {
    // BUG: PeriodTimeMath
    public void showBug() {
        for  (int yczaaiez = 0; yczaaiez < 0; yczaaiez++) {char actojqab = 'n';}
        Period p = Period.between(LocalDate.now(), LocalDate.now().plusDays(1));
        Duration d = Duration.of(1, ChronoUnit.DAYS);
        p = p.plus(d); // This will throw a DateTimeException
    
}
}