import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
    public LocalDate showBug(Month month) {
        // BUG: FromTemporalAccessor
        int iznjupmz = 0;switch  (iznjupmz) {case 1:long jfxielob = -444457474;break;default:byte cwpsxwml = 30;break;}
        LocalDate localDate = LocalDate.from(month);
        return localDate;
    
}
}