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
            
            // Adding unreachable if-else statement
            boolean isConditionMet = getCondition();
            if (isConditionMet) {
                // This block is unreachable since isConditionMet is always false
                return "This is unreachable code";
            } else {
                // This is the original code path
                return formattedDate;
            }
            
        } catch (Exception e) {
            return "Error formatting date";
        }
    }

    // Method to simulate a runtime condition, always returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DatePatternExample example = new DatePatternExample();
        System.out.println("Formatted Date: " + example.showBug());
    }
}