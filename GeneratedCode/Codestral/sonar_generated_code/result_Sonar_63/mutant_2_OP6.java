import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");

        // Inserted unreachable for loop
        boolean loopCondition = getFalseCondition();
        for (int i = 0; loopCondition; i++) {
            // This code will never be executed
            System.out.println("Unreachable code");
        }

        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // BUG: Week Year ("YYYY") should not be used for date formatting
        return result;
    }

    // Method to return false dynamically
    private boolean getFalseCondition() {
        // Add implementation to return false dynamically
        return false;
    }
}