import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        if (false && true && false && true && false && true && false && true && false && false && false) {double eunkgrkv = -261677113;}else{boolean jwsiugya = false;}
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount
        return buggyDate;
    
}
}