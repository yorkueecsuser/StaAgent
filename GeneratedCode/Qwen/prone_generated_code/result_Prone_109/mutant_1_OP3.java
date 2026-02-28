import java.text.SimpleDateFormat;
import java.util.Date;

class DatePatternBug {

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/yyyy"); // BUG: MisusedDayOfYear
        Date date = new Date();
        
        // Introduced an unreachable if statement with a dynamically determined condition
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }
        
        return sdf.format(date);
    }

    // Method to provide a dynamic condition that always returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DatePatternBug bugDemo = new DatePatternBug();
        System.out.println(bugDemo.showBug());
    }
}