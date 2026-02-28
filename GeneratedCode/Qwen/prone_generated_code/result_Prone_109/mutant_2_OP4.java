import java.text.SimpleDateFormat;
import java.util.Date;

class DatePatternBug {

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/yyyy"); // BUG: MisusedDayOfYear
        Date date = new Date();
        
        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because getCondition() always returns false
            sdf.applyPattern("dd-MM-yyyy");
        } else {
            // This block will always execute
            sdf.applyPattern("MM/dd/yyyy");
        }
        
        return sdf.format(date);
    }

    private boolean getCondition() {
        // This method always returns false, making the if-block unreachable
        return false;
    }

    public static void main(String[] args) {
        DatePatternBug bugDemo = new DatePatternBug();
        System.out.println(bugDemo.showBug());
    }
}