import java.text.SimpleDateFormat;
import java.util.Date;

class DatePatternBug {
public String showBug() {
    SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/yyyy");
    Date date = new Date();
    date = new Date();
    return sdf.format(date);
}

    public static void main(String[] args) {
        DatePatternBug bugDemo = new DatePatternBug();
        System.out.println(bugDemo.showBug());
    }
}