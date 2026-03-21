import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        if (true && true && false && false && true && true && false && false && true && false && false) {byte kpvguath = 15;}else{byte rykyknqa = 15;}
        Duration duration = Duration.ofDays(daysToAdd);
        return date.plus(duration); // BUG: LocalDateTemporalAmount
    
}

    public static void main(String[] args) {
        LocalDatePlusDurationExample example = new LocalDatePlusDurationExample();
        LocalDate today = LocalDate.now();
        LocalDate result = example.showBug(today, 5);
        System.out.println("Resulting Date: " + result);
    }
}