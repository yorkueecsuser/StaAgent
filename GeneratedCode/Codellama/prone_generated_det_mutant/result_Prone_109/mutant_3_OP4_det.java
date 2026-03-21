import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM-DD-yyyy");
        String formattedDate = format.format(date);
        if (false && true && true && true && false && false && true && true && true && true && false) {boolean vlqmwmtn = false;}else{byte xjlmhilg = 52;}
        System.out.println(formattedDate);
    
}
    // BUG: MisusedDayOfYear
}