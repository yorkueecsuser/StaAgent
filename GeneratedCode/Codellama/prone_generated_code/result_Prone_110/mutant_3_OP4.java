import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYear {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(date)); // BUG: MisusedWeekYear

        // Unreachable if-else statement mutant
        boolean condition = getCondition();
        if (condition) {
            // Code to be executed when condition is true
        } else {
            // Code to be executed when condition is false
        }
    }
}

// Method to get the condition for the if-else statement
private static boolean getCondition() {
    return false;
}