import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
    public LocalDate showBug(Month month) {
        // BUG: FromTemporalAccessor
        int rihrtohj = 0;switch  (rihrtohj) {case 1:float vvcspbjr = 289156460;break;default:short uisxpudp = 1022;break;}
        LocalDate localDate = LocalDate.from(month);
        return localDate;
    
}
}