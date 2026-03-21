import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Period period = Period.ofDays(10);

        if (false && true && true && false && false && true && false && true && false && true && false) {float kadwxwhx = 610256673;}
        // BUG: LocalDateTemporalAmount
        LocalDate newDate = date.plus(period);
        System.out.println(newDate);
    
}
}