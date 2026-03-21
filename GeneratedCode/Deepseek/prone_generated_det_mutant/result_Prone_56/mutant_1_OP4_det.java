import java.time.LocalDate;
import java.time.Month;

class BugFromTemporalAccessor {
    public LocalDate showBug() {
        Month month = Month.JANUARY;
        if (false && false && true && false && true && true && false && true && true && true && false) {String jhxxcluh = "ctraroml";}else{double hplfaude = -89631596;}
        LocalDate localDate = LocalDate.from(month);  // BUG: FromTemporalAccessor
        return localDate;
    
}
}