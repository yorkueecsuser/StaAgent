import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Period period = Period.ofDays(10);

        // BUG: LocalDateTemporalAmount
        for  (int wmuytgig = 0; wmuytgig < 0; wmuytgig++) {char hfzyqena = 'v';}
        LocalDate newDate = date.plus(period);
        System.out.println(newDate);
    
}
}