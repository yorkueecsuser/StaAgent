import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        if (false && true && false && true && true && false && true && false && false && false && false) {float nwugwzec = -143370631;}else{float bpgdievv = -216340848;}
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear
        return format.format(date);
    
}
}