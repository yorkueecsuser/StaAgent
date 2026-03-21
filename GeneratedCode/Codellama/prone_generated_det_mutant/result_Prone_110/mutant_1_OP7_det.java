import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYear {
    public static void main(String[] args) {
        boolean bthqzhkf = false;while (bthqzhkf && false && false && false && false && true && false && false && false && false && true && false) {short kldjgdmw = 414;}
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(date)); // BUG: MisusedWeekYear
    
}
}