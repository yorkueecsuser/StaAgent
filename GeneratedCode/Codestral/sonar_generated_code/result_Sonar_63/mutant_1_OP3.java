import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // BUG: Week Year ("YYYY") should not be used for date formatting

        // Inserted unreachable if statement
        boolean alwaysFalse = getCondition();
        if (alwaysFalse) {
            // This code block is unreachable, as the condition is always false
            int unreachableVar = 10;
            System.out.println("This line is unreachable: " + unreachableVar);
        }

        return result;
    }

    // Method to get the condition for the unreachable if statement
    private boolean getCondition() {
        return false;
    }
}