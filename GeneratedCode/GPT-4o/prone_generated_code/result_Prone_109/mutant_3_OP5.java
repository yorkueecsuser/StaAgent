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
            
            // Unreachable switch statement - dynamically determined condition
            int condition = getCondition();
            switch (condition) {
                case 1:
                    // This block is unreachable because getCondition() will return 0
                    System.out.println("This is an unreachable case.");
                    break;
                default:
                    // Default case, nothing to do here
                    break;
            }
            
            return formattedDate;
            
        } catch (Exception e) {
            return "Error formatting date";
        }
    }

    private int getCondition() {
        return 0; // Always return 0 to ensure the switch statement case remains unreachable
    }

    public static void main(String[] args) {
        DatePatternExample example = new DatePatternExample();
        System.out.println("Formatted Date: " + example.showBug());
    }
}