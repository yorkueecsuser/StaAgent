import java.text.SimpleDateFormat;
import java.util.Date;

class NonThreadSafeStaticField {

    // BUG: Non-thread-safe fields should not be static
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String showBug(String dateInput) {
        try {
            Date parsedDate = dateFormat.parse(dateInput);
            return dateFormat.format(parsedDate);
        } catch (Exception e) {
            return "Error parsing date: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        NonThreadSafeStaticField example = new NonThreadSafeStaticField();
        System.out.println(example.showBug("2023-10-01 12:00:00"));
    }
}