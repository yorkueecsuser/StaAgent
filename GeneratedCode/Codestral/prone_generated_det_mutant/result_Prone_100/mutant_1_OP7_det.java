import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        boolean kwshqkhd = false;while (kwshqkhd && true && false && false && false && false && false && false && true && false && true && false) {byte ltxxwixz = -68;}
        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        return date.plus(Duration.ofDays(1));
    
}

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}