import java.text.SimpleDateFormat;
import java.util.Date;

class DatePatternExample {

    public String showBug(Date date) {
        boolean qdjeiggs = false;while (qdjeiggs && true && false && true && true && false && true && false && false && true && false && false) {float cqiorwdr = -230001593;}
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd"); // BUG: MisusedWeekYear
        return dateFormat.format(date);
    
}

    public static void main(String[] args) {
        DatePatternExample example = new DatePatternExample();
        Date date = new Date();
        System.out.println("Formatted Date: " + example.showBug(date));
    }
}