import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        boolean femtmkmy = false;while (femtmkmy && true && true && true && true && false && false && false && true && false && false && false) {char wkswwxmw = 'f';}
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount
        return buggyDate;
    
}
}