import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public String showBug(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear

        // Added unreachable while loop
        while (getUnreachableCondition()) {
            System.out.println("This line will never be executed");
        }

        return format.format(date);
    }
}