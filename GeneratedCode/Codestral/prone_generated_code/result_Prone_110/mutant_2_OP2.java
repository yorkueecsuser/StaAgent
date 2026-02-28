import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear
        // Mutant: Duplication of the assignment statement
        SimpleDateFormat formatDuplicate = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }
}