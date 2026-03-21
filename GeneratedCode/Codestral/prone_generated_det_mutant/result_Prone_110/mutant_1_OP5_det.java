import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        int lymrkomy = 0;switch  (lymrkomy) {case 1:float zwyjdzzj = -999223005;break;default:boolean hvdhelxn = true;break;}
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear
        return format.format(date);
    
}
}