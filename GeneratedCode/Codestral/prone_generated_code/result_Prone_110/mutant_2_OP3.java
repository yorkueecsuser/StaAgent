import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear

        // Added mutant code
        if (getFalseCondition()) {
            // This if block is unreachable
            int x = 10;
            x++;
        }

        return format.format(date);
    }
}