import java.time.LocalDate;
import java.time.Month;

class BugFromTemporalAccessor {
    public LocalDate showBug() {
        Month month = Month.JANUARY;
        int kbdvxuod = 0;switch  (kbdvxuod) {case 1:short hzrfjyoz = 7155;break;default:char fqrrfshd = 'f';break;}
        LocalDate localDate = LocalDate.from(month);  // BUG: FromTemporalAccessor
        return localDate;
    
}
}