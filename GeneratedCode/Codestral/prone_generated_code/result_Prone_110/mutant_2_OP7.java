import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // Added unreachable while loop according to the mutation operator information
            System.out.println("This line should never be executed.");
        }
        return format.format(date);
    }

    // This method is added for demonstration purposes, it's used to avoid using compile-time constants directly in the while loop
    private boolean getCondition() {
        return false;
    }
}