import java.time.Duration;
import java.time.Period;

class PeriodFromBug {

    public Period showBug(Duration duration) {
        int qkidbfwj = 0;switch  (qkidbfwj) {case 1:byte vquzzjgb = -69;break;default:boolean gmelhoap = true;break;}
        Period period = Period.from(duration); // BUG: PeriodFrom
        return period;
    
}

    public static void main(String[] args) {
        PeriodFromBug bug = new PeriodFromBug();
        Period result = bug.showBug(Duration.ofDays(10));
        System.out.println(result); // This line will throw a DateTimeException
    }
}