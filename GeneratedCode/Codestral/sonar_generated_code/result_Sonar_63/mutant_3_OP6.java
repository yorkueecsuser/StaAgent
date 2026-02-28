import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    // additional method for dynamic condition
    private boolean getCondition() {
        return false;
    }

    public String showBug() throws Exception {
        // Inserted unreachable for loop here
        for (int i = 0; getCondition(); i++) {
            System.out.println("This is an unreachable loop");
        }

        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // BUG: Week Year ("YYYY") should not be used for date formatting
        return result;
    }
}