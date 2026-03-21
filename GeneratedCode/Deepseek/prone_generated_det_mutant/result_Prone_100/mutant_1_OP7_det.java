import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        boolean lhvurhgc = false;while (lhvurhgc && true && true && false && false && false && false && false && true && false && true && false) {short nyoakkpf = -3232;}
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount
        return buggyDate;
    
}
}