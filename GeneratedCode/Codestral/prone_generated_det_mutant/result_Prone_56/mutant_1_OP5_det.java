import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
    public LocalDate showBug(Month month) {
        // BUG: FromTemporalAccessor
        int ifygzhrj = 0;switch  (ifygzhrj) {case 1:byte mplfyzak = -115;break;default:boolean gywajrzw = false;break;}
        LocalDate localDate = LocalDate.from(month);
        return localDate;
    
}
}