import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {

    public String[] showBug() throws ParseException {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result1 = new SimpleDateFormat("YYYY/MM/dd").format(date);
        String result2 = new SimpleDateFormat("YYYY/MM/dd").format(date);

        boolean shouldRun = false;
        if (shouldRun) {
            int x;  // This line ensures the code is not unreachable
            x = 10;
        } else {
            int y; // This line ensures the code is not unreachable
            y = 20;
        }

        return new String[]{result1, result2};
    }
}