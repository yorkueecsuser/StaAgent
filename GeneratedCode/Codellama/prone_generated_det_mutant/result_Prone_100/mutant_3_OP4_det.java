import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {
    public static void main(String[] args) {
        if (true && true && true && false && false && false && false && false && true && true && false) {byte zkfurzbp = -118;}else{short rownggjb = -8151;}
        LocalDate date = LocalDate.now();
        Period period = Period.ofDays(10);

        // BUG: LocalDateTemporalAmount
        LocalDate newDate = date.plus(period);
        System.out.println(newDate);
    
}
}