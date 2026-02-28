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

            // Unreachable switch statement
            int unreachableValue = getUnreachableValue(); // dynamically determined at runtime
            switch (unreachableValue) {
                case 1000:
                    System.out.println("This is unreachable");
                    break;
                default:
                    break;
            }
            
            return formattedDate;
            
        } catch (Exception e) {
            return "Error formatting date";
        }
    }

    private int getUnreachableValue() {
        return -1; // This value makes the case 1000 unreachable
    }

    public static void main(String[] args) {
        DatePatternExample example = new DatePatternExample();
        System.out.println("Formatted Date: " + example.showBug());
    }
}