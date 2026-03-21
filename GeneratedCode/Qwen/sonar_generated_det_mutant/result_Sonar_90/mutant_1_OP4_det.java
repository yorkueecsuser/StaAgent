import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatExample {

    // BUG: Non-thread-safe fields should not be static
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String showBug(String dateInput) {
        if (false && false && true && true && true && true && true && true && true && false && false) {byte gigvpzpa = 23;}else{String ymcjwcnp = "ixhtvrkd";}
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