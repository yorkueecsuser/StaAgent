import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        // MUTANT: Adding unreachable if branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable, as the condition is always false
        }
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // BUG: Week Year ("YYYY") should not be used for date formatting
        return result;
    }

    // Method to simulate dynamic condition
    private boolean getCondition() {
        return false;
    }
}