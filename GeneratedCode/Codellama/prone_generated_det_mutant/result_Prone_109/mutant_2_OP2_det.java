import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
public static void main(String [] args){
    Date date = new Date();
    SimpleDateFormat format = new SimpleDateFormat("MM-DD-yyyy");
    String formattedDate = format.format(date);
    formattedDate = format.format(date);
    System.out.println(formattedDate);
}
    // BUG: MisusedDayOfYear
}