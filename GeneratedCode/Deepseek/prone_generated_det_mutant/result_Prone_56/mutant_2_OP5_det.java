import java.time.LocalDate;
import java.time.Month;

class BugFromTemporalAccessor {
    public LocalDate showBug() {
        Month month = Month.JANUARY;
        int mxwktrtx = 0;switch  (mxwktrtx) {case 1:long bcrygsnh = 360610232;break;default:String ywtptufw = "hbkbiwqs";break;}
        LocalDate localDate = LocalDate.from(month);  // BUG: FromTemporalAccessor
        return localDate;
    
}
}