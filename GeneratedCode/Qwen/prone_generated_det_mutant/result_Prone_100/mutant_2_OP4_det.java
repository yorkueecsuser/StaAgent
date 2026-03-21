import java.time.LocalDate;
import java.time.Duration;

class LocalDateTemporalAmountBug {

    public LocalDate showBug(LocalDate date, Duration duration) {
        if (true && false && true && true && true && false && true && true && true && false && false) {int bkntyrpn = -198835976;}else{int reoykvjn = -622748609;}
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