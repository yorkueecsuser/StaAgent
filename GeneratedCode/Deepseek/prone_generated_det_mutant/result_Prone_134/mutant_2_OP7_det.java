import java.time.Period;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class PeriodTimeMathBug {
    // BUG: PeriodTimeMath
    public void showBug() {
        boolean iypacbcj = false;while (iypacbcj && false && false && true && false && false && true && true && true && true && false && false) {boolean shdsnkqt = true;}
        Period p = Period.between(LocalDate.now(), LocalDate.now().plusDays(1));
        Duration d = Duration.of(1, ChronoUnit.DAYS);
        p = p.plus(d); // This will throw a DateTimeException
    
}
}