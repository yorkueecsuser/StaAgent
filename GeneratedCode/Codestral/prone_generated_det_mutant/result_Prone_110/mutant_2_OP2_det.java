import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
public String showBug(Date date){
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    format = new SimpleDateFormat("yyyy-MM-dd");
    return format.format(date);
}
}