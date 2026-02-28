import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        // Dead store mutation
        int unusedVariable = 5;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear
        return format.format(date);
    }
}