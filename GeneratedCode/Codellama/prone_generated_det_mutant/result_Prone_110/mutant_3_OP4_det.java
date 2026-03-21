import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYear {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        if (false && true && true && true && false && false && true && false && true && false && false) {int iobhoavg = 831836078;}else{float gojqwyra = 911675335;}
        System.out.println(sdf.format(date)); // BUG: MisusedWeekYear
    
}
}