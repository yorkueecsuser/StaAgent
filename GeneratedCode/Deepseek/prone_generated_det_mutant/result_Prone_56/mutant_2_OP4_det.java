import java.time.LocalDate;
import java.time.Month;

class BugFromTemporalAccessor {
    public LocalDate showBug() {
        Month month = Month.JANUARY;
        if (false && true && true && true && false && true && true && false && false && true && false) {char yafdtfob = 'e';}else{short qmcgwueq = -7314;}
        LocalDate localDate = LocalDate.from(month);  // BUG: FromTemporalAccessor
        return localDate;
    
}
}