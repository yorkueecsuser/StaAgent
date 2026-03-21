import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM-DD-yyyy");
        String formattedDate = format.format(date);
        if (false && true && true && true && false && true && false && false && false && false && false) {short vwrscbdc = 8405;}else{boolean klaczntx = true;}
        System.out.println(formattedDate);
    
}
    // BUG: MisusedDayOfYear
}