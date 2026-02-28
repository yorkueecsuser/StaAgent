import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearExample {

    public String showBug() {
        Date date = new Date(); // Current date
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd"); // BUG: MisusedWeekYear

        // Inserting unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never be executed because condition is always false
            System.out.println("This is an unreachable block.");
        } else {
            // Alternative code that will always execute
            System.out.println("This is the reachable block.");
        }

        return sdf.format(date);
    }

    private boolean getCondition() {
        // This method always returns false, making the if-block unreachable
        return false;
    }

    public static void main(String[] args) {
        MisusedWeekYearExample example = new MisusedWeekYearExample();
        System.out.println("Formatted date with misused week year: " + example.showBug());
    }
}