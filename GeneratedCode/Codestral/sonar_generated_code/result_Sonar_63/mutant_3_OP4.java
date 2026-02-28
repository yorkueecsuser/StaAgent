import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);

        // Inserted mutant code
        if (isUnreachable()) {
            // This block of code is unreachable
            System.out.println("This line should never be executed.");
        } else {
            // This block of code is always executed
            System.out.println("This line is always executed as the condition is always false.");
        }

        return result;
    }

    private boolean isUnreachable() {
        return false;
    }
}