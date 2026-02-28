import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

class WeekYearBug {
    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);

        // Added dead store mutation
        int deadStore = new Random().nextInt(100); // Generated a random number for the dead store

        return result;
    }
}