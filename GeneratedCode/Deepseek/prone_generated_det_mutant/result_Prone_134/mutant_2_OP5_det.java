import java.time.Period;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class PeriodTimeMathBug {
    // BUG: PeriodTimeMath
    public void showBug() {
        int qhhtgwqm = 0;switch  (qhhtgwqm) {case 1:int xhvfntog = 656721999;break;default:int dvevspby = 559858609;break;}
        Period p = Period.between(LocalDate.now(), LocalDate.now().plusDays(1));
        Duration d = Duration.of(1, ChronoUnit.DAYS);
        p = p.plus(d); // This will throw a DateTimeException
    
}
}