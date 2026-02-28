import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYear {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(date)); // BUG: MisusedWeekYear

        // Inserted unreachable for loop
        for (int i = 0; false; i++) {
            // Code that will never be executed
            System.out.println("This line will never be printed");
        }
    }
}