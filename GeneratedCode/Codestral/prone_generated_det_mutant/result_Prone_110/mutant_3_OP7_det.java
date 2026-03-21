import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        boolean gzftvifm = false;while (gzftvifm && false && false && false && true && false && true && false && false && false && true && false) {boolean khfaqwce = true;}
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear
        return format.format(date);
    
}
}