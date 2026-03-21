import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        for  (int coidoiwb = 0; coidoiwb < 0; coidoiwb++) {long zhpcrezi = -858316092;}
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM-DD-yyyy");
        String formattedDate = format.format(date);
        System.out.println(formattedDate);
    
}
    // BUG: MisusedDayOfYear
}