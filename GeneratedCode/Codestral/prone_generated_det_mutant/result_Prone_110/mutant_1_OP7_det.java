import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        boolean dzbhlytz = false;while (dzbhlytz && false && true && true && false && false && false && true && true && false && false && false) {short kvdrdjmu = 2889;}
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear
        return format.format(date);
    
}
}