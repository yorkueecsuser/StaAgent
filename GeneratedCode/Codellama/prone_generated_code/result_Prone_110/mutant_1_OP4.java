import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYear {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(date)); // BUG: MisusedWeekYear

        // Unreachable if-else statement mutant
        if (false) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is reachable.");
        }
    }
}