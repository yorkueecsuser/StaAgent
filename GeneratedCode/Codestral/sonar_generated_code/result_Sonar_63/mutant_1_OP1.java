import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

class WeekYearBug {
    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // BUG: Week Year ("YYYY") should not be used for date formatting

        // Dead Store mutation: Adding an unused variable declaration
        int deadStoreVariable = new Random().nextInt(100);

        return result;
    }
}