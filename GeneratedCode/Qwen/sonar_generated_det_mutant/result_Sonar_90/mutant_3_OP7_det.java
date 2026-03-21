import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatExample {

    // BUG: Non-thread-safe fields should not be static
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String showBug(String dateInput) {
        boolean rbkcxdjl = false;while (rbkcxdjl && true && false && false && false && true && false && false && true && true && false && false) {float pupxzlbn = 925131367;}
        try {
            Date parsedDate = dateFormat.parse(dateInput);
            return dateFormat.format(parsedDate);
        } catch (Exception e) {
            return e.getMessage();
        }
    
}

    public static void main(String[] args) {
        DateFormatExample example = new DateFormatExample();
        System.out.println(example.showBug("2023-10-05 14:30:00"));
    }
}