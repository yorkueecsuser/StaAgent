import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {
    public static void main(String[] args) {
        if (true && true && false && true && false && true && true && false && false && false && false) {byte vkuqmssn = -106;}else{long kgwdbnlr = -594384076;}
        LocalDate date = LocalDate.now();
        Period period = Period.ofDays(10);

        // BUG: LocalDateTemporalAmount
        LocalDate newDate = date.plus(period);
        System.out.println(newDate);
    
}
}