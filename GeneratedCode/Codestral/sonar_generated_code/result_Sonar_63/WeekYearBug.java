import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    public String showBug() throws Exception {
        // Inserted mutant: unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code should never be executed
            System.out.println("Unreachable code");
        }

        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);
        return result;
    }

    private boolean getUnreachableCondition() {
        // Always return false to make the loop unreachable
        return false;
    }
}