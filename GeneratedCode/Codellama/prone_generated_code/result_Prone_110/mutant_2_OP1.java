import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYear {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        String a = sdf.format(date); // Dead Store Mutation
        System.out.println(sdf.format(date)); // BUG: MisusedWeekYear
    }
}