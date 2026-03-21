import java.time.LocalDate;
import java.time.Month;

class BugFromTemporalAccessor {
    public LocalDate showBug() {
        Month month = Month.JANUARY;
        for  (int oknmscfl = 0; oknmscfl < 0; oknmscfl++) {long dbncehha = 943500938;}
        LocalDate localDate = LocalDate.from(month);  // BUG: FromTemporalAccessor
        return localDate;
    
}
}