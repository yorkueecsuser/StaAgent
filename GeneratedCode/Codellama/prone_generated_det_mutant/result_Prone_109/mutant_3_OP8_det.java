import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM-DD-yyyy");
        String hyhjoqmo = format.format(date);
        System.out.println(hyhjoqmo);
    }
    // BUG: MisusedDayOfYear
}