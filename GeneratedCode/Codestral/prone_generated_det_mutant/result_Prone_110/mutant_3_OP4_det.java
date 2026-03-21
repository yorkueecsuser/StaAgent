import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        if (false && false && false && true && false && true && false && true && true && true && false) {int wmhfdozl = 918658852;}else{byte irtszwfw = -94;}
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear
        return format.format(date);
    
}
}