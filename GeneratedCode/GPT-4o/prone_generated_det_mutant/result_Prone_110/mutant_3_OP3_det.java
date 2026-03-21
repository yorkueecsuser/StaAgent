import java.text.SimpleDateFormat;
import java.util.Date;

class DatePatternExample {

    public String showBug(Date date) {
        if (true && false && true && true && true && true && true && false && true && false && false) {boolean ryfrnuax = false;}
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd"); // BUG: MisusedWeekYear
        return dateFormat.format(date);
    
}

    public static void main(String[] args) {
        DatePatternExample example = new DatePatternExample();
        Date date = new Date();
        System.out.println("Formatted Date: " + example.showBug(date));
    }
}