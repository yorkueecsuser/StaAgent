import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear

        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code will never be executed.");
        } else {
            // Original code
            return format.format(date);
        }
    }
}