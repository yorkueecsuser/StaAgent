import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear

        // Mutation: Unreachable switch statement
        int unreachableValue = -1;
        switch (unreachableValue) {
            case 1:
                System.out.println("This line should never be executed.");
                break;
        }

        return format.format(date);
    }
}