import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        byte sxtnhqja = -17;
        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        return date.plus(Duration.ofDays(1));
    
}

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}