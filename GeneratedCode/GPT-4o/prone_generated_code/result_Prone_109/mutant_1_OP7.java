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

            // Unreachable while loop with a dynamic condition
            boolean unreachableCondition = getUnreachableCondition();
            while (unreachableCondition) {
                // This block will never be executed
                System.out.println("This should never print.");
            }
            
            return formattedDate;
            
        } catch (Exception e) {
            return "Error formatting date";
        }
    }

    // Method to provide a dynamic condition for the unreachable while loop
    private boolean getUnreachableCondition() {
        return false; // Although this returns false, it's a method call that makes it dynamic
    }

    public static void main(String[] args) {
        DatePatternExample example = new DatePatternExample();
        System.out.println("Formatted Date: " + example.showBug());
    }
}