import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYear {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(date)); // BUG: MisusedWeekYear

        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This if branch is unreachable because the condition is always false
        }
    }
}