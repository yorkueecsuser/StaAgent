import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        boolean ubchwnrq = false;while (ubchwnrq && false && true && false && true && false && true && true && true && false && false && false) {double bptpfyfn = -713893767;}
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear
        return format.format(date);
    
}
}