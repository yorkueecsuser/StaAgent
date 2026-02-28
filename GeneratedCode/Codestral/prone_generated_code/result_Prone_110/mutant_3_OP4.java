import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    private boolean getCondition() {
        // Returning false dynamically to make the if branch unreachable
        return false;
    }

    public String showBug(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear
        if (getCondition()) {
            // Code that will never be executed
            throw new RuntimeException("Unreachable code executed");
        }
        return format.format(date);
    }
}