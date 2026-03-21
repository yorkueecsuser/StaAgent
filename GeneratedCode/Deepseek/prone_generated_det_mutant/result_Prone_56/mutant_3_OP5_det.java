import java.time.LocalDate;
import java.time.Month;

class BugFromTemporalAccessor {
    public LocalDate showBug() {
        Month month = Month.JANUARY;
        int bqmdehaw = 0;switch  (bqmdehaw) {case 1:double dzavjdvy = 879006487;break;default:double gajbgoww = -699512906;break;}
        LocalDate localDate = LocalDate.from(month);  // BUG: FromTemporalAccessor
        return localDate;
    
}
}