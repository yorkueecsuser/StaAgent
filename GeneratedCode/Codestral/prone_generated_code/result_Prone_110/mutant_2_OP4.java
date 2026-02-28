import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear

        // Mutated code: Unreachable if-else statement
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            // This code will never be executed as the condition is always false
            System.out.println("This is an unreachable block of code");
        } else {
            // The else block is still reachable and executes the original code
            return format.format(date);
        }
    }
}