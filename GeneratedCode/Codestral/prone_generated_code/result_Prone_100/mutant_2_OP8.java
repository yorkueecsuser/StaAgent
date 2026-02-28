import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {

    public LocalDate showBug() {
        LocalDate currentDate = LocalDate.now();
        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        return currentDate.plus(Duration.ofDays(1));
    }

    public static void main(String[] args) {
        LocalDateBug buggyInstance = new LocalDateBug();
        System.out.println(buggyInstance.showBug());
    }
}