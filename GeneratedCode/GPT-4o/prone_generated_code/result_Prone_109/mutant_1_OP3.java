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

            // Unreachable if statement
            boolean condition = getCondition(); // Use method to determine condition
            if (condition) {
                System.out.println("This branch is unreachable.");
            }
            
            return formattedDate;
            
        } catch (Exception e) {
            return "Error formatting date";
        }
    }

    // Method to provide a condition for the unreachable if statement
    private boolean getCondition() {
        return false; // Condition is always false, making the if statement unreachable
    }

    public static void main(String[] args) {
        DatePatternExample example = new DatePatternExample();
        System.out.println("Formatted Date: " + example.showBug());
    }
}