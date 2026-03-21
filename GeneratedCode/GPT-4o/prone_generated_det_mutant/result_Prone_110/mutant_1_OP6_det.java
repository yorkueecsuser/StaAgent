import java.text.SimpleDateFormat;
import java.util.Date;

class DatePatternExample {

    public String showBug(Date date) {
        for  (int evgdbphw = 0; evgdbphw < 0; evgdbphw++) {String rveaiehe = "zibktgxz";}
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd"); // BUG: MisusedWeekYear
        return dateFormat.format(date);
    
}

    public static void main(String[] args) {
        DatePatternExample example = new DatePatternExample();
        Date date = new Date();
        System.out.println("Formatted Date: " + example.showBug(date));
    }
}