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
            
            // Unreachable if branch
            boolean condition = getCondition();
            if (condition) {
                System.out.println("This will never be printed.");
            }
            
            return formattedDate;
            
        } catch (Exception e) {
            return "Error formatting date";
        }
    }

    // Method to simulate a dynamic condition that always returns false
    private boolean getCondition() {
        return false; // Simulate an always false condition
    }

    public static void main(String[] args) {
        DatePatternExample example = new DatePatternExample();
        System.out.println("Formatted Date: " + example.showBug());
    }
}