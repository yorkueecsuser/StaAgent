import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This line is unreachable
                break;
            // Add more cases if needed, but make sure none of them match the value returned by getUnreachableValue
        }
        return format.format(date);
    }

    private int getUnreachableValue() {
        return 0;
    }
}