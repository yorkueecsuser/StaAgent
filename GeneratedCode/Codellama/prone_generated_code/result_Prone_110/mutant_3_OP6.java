import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYear {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(date)); // BUG: MisusedWeekYear

        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // unreachable code
        }
    }

    private static boolean getCondition() {
        return false;
    }
}