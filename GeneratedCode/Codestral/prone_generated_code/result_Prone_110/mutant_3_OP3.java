import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // unreachable code
            return "This code will never be executed.";
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear
        return format.format(date);
    }
}