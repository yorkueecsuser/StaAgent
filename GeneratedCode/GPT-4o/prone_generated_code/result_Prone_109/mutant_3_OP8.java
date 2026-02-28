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
            
            return formattedDate;
            
        } catch (Exception e) {
            return "Error formatting date";
        }
    }

    // Mutant method with a renamed variable
    public String showBugMutant() {
        try {
            // Create a date object for demonstration
            Date d = new Date();  // Renamed variable 'date' to 'd'
            
            // Buggy date pattern: 'DD' is used with 'MM', which is incorrect
            SimpleDateFormat formatter = new SimpleDateFormat("MM-DD-yyyy"); // BUG: MisusedDayOfYear
            
            // Format the date using the incorrect pattern
            String formattedDate = formatter.format(d);
            
            return formattedDate;
            
        } catch (Exception e) {
            return "Error formatting date";
        }
    }

    public static void main(String[] args) {
        DatePatternExample example = new DatePatternExample();
        System.out.println("Formatted Date: " + example.showBug());
        System.out.println("Formatted Date Mutant: " + example.showBugMutant());
    }
}