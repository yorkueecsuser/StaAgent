import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear

        // Dead Store Mutation: Adding an unused variable declaration
        int unusedVariable = new Random().nextInt();

        return format.format(date);
    }
}