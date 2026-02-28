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
            
            // Introduce unreachable while loop
            boolean conditionWhile = false; // Non-final variable used
            while (conditionWhile) {
                // Unreachable code
                System.out.println("This code is unreachable.");
            }
            
            return formattedDate;
            
        } catch (Exception e) {
            return "Error formatting date";
        }
    }

    public static void main(String[] args) {
        DatePatternExample example = new DatePatternExample();
        System.out.println("Formatted Date: " + example.showBug());
    }
}