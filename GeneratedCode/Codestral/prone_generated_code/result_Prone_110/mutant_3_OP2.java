import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear
        SimpleDateFormat formatDuplicate = new SimpleDateFormat("yyyy-MM-dd"); // Duplicated statement
        return format.format(date);
    }
}