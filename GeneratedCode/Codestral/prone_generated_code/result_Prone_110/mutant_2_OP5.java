import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear

        // Added mutant code
        int unreachableValue = -1;
        switch (unreachableValue) {
            case 1:
                // This code is unreachable
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                // This is the default case which will be executed
                break;
        }

        return format.format(date);
    }
}