import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // Unreachable code
            System.out.println("This code will never execute");
        }
        return format.format(date);
    }

    private boolean getCondition() {
        return false;
    }
}