import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        // Inserting unreachable while loop
        while (isLoopConditionFalse()) {
            // This code will never be executed
        }
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // BUG: Week Year ("YYYY") should not be used for date formatting
        return result;
    }

    // This method always returns false
    private boolean isLoopConditionFalse() {
        return false;
    }
}