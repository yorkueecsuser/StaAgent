import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat a = format; // Mutant code
        return a.format(date);
    }
}