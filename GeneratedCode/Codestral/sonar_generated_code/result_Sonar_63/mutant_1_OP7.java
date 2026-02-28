import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);

        // Mutant Code: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code block will never be executed as the condition is always false.
            System.out.println("This is an unreachable block");
        }

        return result;
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop unreachable.
        return false;
    }
}