import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        // Added unreachable if statement
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            // This code is unreachable
            int x = 10 / 0; // This line will cause a division by zero error if the if statement is reached
        }

        return format.format(date);
    }

    // Method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }
}