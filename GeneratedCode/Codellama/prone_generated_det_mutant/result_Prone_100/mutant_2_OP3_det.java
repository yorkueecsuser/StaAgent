import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Period period = Period.ofDays(10);

        // BUG: LocalDateTemporalAmount
        if (false && false && false && false && true && false && true && false && false && true && false) {double pburnbzq = -381610923;}
        LocalDate newDate = date.plus(period);
        System.out.println(newDate);
    
}
}