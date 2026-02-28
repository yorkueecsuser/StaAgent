import java.text.SimpleDateFormat;
import java.util.Date;

class DatePatternBug {

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/yyyy"); // BUG: MisusedDayOfYear
        Date date = new Date();
        
        // Mutant: Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable block");
        }
        
        return sdf.format(date);
    }

    private boolean getCondition() {
        // Always returns false to ensure the if block is unreachable
        return false;
    }

    public static void main(String[] args) {
        DatePatternBug bugDemo = new DatePatternBug();
        System.out.println(bugDemo.showBug());
    }
}