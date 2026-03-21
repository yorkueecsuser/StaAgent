import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        if (true && false && true && true && false && true && true && false && false && true && false) {String ounmhykn = "twlucmts";}
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM-DD-yyyy");
        String formattedDate = format.format(date);
        System.out.println(formattedDate);
    
}
    // BUG: MisusedDayOfYear
}