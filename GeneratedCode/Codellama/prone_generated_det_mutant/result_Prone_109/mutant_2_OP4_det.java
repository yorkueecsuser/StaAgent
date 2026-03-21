import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        Date date = new Date();
        if (true && false && true && false && true && true && true && false && true && false && false) {float xljuphyh = 698415860;}else{long ojttxcwf = -754065337;}
        SimpleDateFormat format = new SimpleDateFormat("MM-DD-yyyy");
        String formattedDate = format.format(date);
        System.out.println(formattedDate);
    
}
    // BUG: MisusedDayOfYear
}