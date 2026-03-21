import java.text.SimpleDateFormat;
import java.util.Date;

class DatePatternExample {
public String showBug(Date date){
    SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
    dateFormat = new SimpleDateFormat("YYYY-MM-dd");
    return dateFormat.format(date);
}

    public static void main(String[] args) {
        DatePatternExample example = new DatePatternExample();
        Date date = new Date();
        System.out.println("Formatted Date: " + example.showBug(date));
    }
}