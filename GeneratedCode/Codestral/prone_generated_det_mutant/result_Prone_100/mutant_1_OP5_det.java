import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        int zmxrosme = 0;switch  (zmxrosme) {case 1:short yzcqfhlp = -4479;break;default:boolean gocqewxh = true;break;}
        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        return date.plus(Duration.ofDays(1));
    
}

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}