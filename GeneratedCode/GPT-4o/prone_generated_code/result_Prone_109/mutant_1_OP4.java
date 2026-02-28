import java.text.SimpleDateFormat;
import java.util.Date;

class DatePatternExample {

    public String showBug() {
        try {
            // Create a date object for demonstration
            Date date = new Date();
            
            // Buggy date pattern: 'DD' is used with 'MM', which is incorrect
            SimpleDateFormat formatter = new SimpleDateFormat("MM-DD-yyyy"); // BUG: MisusedDayOfYear
            
            // Format the date using the incorrect pattern
            String formattedDate = formatter.format(date);
            
            // Unreachable if-else branch
            boolean condition = getCondition(); // Non-final variable to determine the if condition
            if (condition) {
                // This will never execute because getCondition() always returns false
                System.out.println("Unreachable code executed!");
            } else {
                // This part will always execute
                System.out.println("This code is always reached.");
            }
            
            return formattedDate;
            
        } catch (Exception e) {
            return "Error formatting date";
        }
    }

    private boolean getCondition() {
        // Always returns false to simulate unreachable branch
        return false;
    }

    public static void main(String[] args) {
        DatePatternExample example = new DatePatternExample();
        System.out.println("Formatted Date: " + example.showBug());
    }
}