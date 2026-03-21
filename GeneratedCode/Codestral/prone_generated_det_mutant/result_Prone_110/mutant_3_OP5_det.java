import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        int fahnqwwf = 0;switch  (fahnqwwf) {case 1:short qnkwykea = -1794;break;default:float yduperyz = 396093626;break;}
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear
        return format.format(date);
    
}
}