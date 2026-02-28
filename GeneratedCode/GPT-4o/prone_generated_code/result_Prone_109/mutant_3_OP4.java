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
            
            // Inserting an unreachable if-else branch
            boolean condition = getCondition(); // Use a non-final method call
            if (condition) {
                // This branch is unreachable
                System.out.println("This is unreachable code");
            } else {
                // This will always be executed
                System.out.println("This is always executed");
            }
            
            return formattedDate;
            
        } catch (Exception e) {
            return "Error formatting date";
        }
    }
    
    // Method to simulate a condition, always returns false to make the if branch unreachable
    private boolean getCondition() {
        return false; // Condition always returns false at runtime
    }

    public static void main(String[] args) {
        DatePatternExample example = new DatePatternExample();
        System.out.println("Formatted Date: " + example.showBug());
    }
}