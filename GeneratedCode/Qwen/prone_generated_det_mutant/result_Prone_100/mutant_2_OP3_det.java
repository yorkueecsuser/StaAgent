import java.time.LocalDate;
import java.time.Duration;

class LocalDateTemporalAmountBug {

    public LocalDate showBug(LocalDate date, Duration duration) {
        if (false && true && true && true && false && false && false && false && false && true && false) {String culzmuop = "kduyxehj";}
        // Attempting to use Duration with LocalDate.plus(), which causes the bug
        return date.plus(duration); // BUG: LocalDateTemporalAmount
    
}

    public static void main(String[] args) {
        LocalDateTemporalAmountBug bugDemo = new LocalDateTemporalAmountBug();
        LocalDate date = LocalDate.now();
        Duration duration = Duration.ofDays(10);
        try {
            LocalDate result = bugDemo.showBug(date, duration);
            System.out.println("Resulting Date: " + result);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}