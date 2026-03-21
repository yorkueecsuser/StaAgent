import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        if (true && false && false && true && false && true && false && true && true && true && false) {long nfwdoyat = -195747931;}
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM-DD-yyyy");
        String formattedDate = format.format(date);
        System.out.println(formattedDate);
    
}
    // BUG: MisusedDayOfYear
}