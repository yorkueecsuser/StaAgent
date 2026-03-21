import java.time.LocalDate;
import java.time.Month;

class FromTemporalAccessorBug {
    public LocalDate showBug(Month month) {
        // BUG: FromTemporalAccessor
        for  (int mhlxzctx = 0; mhlxzctx < 0; mhlxzctx++) {String rpfvntxk = "ipwekvlq";}
        LocalDate localDate = LocalDate.from(month);
        return localDate;
    
}
}