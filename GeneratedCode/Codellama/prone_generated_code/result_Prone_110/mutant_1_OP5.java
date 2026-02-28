import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYear {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(date)); // BUG: MisusedWeekYear

        // Unreachable switch statement mutant
        boolean shouldRun = false;
        switch (shouldRun) {
            case false:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Reachable code");
        }
    }
}