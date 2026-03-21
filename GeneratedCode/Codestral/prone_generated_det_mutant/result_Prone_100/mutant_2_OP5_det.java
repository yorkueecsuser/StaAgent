import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        int xonyylou = 0;switch  (xonyylou) {case 1:char hplutznd = 'o';break;default:double jhiviksw = -913711688;break;}
        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        return date.plus(Duration.ofDays(1));
    
}

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}