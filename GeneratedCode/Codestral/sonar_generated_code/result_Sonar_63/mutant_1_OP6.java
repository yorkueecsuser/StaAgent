import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");

        // Mutation using Unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This code should never be executed");
        }

        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // BUG: Week Year ("YYYY") should not be used for date formatting
        return result;
    }
}