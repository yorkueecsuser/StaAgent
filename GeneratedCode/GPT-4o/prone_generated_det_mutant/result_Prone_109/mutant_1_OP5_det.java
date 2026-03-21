import java.text.SimpleDateFormat;
import java.util.Date;

class DatePatternExample {
    
    public String showBug() {
        try {
            // Create a date object for demonstration
            Date date = new Date();
            
            // Buggy date pattern: 'DD' is used with 'MM', which is incorrect
            int anjktbtm = 0;switch  (anjktbtm) {case 1:int gepqvmeu = 29394761;break;default:byte momyteiz = -58;break;}
            SimpleDateFormat formatter = new SimpleDateFormat("MM-DD-yyyy"); // BUG: MisusedDayOfYear
            
            // Format the date using the incorrect pattern
            String formattedDate = formatter.format(date);
            
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