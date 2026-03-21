import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        int axbkrdzm = 0;switch  (axbkrdzm) {case 1:float iiuxqume = 802189518;break;default:float yfcihksx = 393657690;break;}
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear
        return format.format(date);
    
}
}