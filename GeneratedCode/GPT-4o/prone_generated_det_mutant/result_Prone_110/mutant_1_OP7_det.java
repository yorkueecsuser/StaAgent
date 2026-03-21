import java.text.SimpleDateFormat;
import java.util.Date;

class DatePatternExample {

    public String showBug(Date date) {
        boolean nqmnzhwn = false;while (nqmnzhwn && true && false && false && true && true && false && false && true && true && true && false) {byte boqouvoe = 94;}
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd"); // BUG: MisusedWeekYear
        return dateFormat.format(date);
    
}

    public static void main(String[] args) {
        DatePatternExample example = new DatePatternExample();
        Date date = new Date();
        System.out.println("Formatted Date: " + example.showBug(date));
    }
}