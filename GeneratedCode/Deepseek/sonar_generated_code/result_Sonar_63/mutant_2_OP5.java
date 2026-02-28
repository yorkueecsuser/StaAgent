import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {

    public String[] showBug() throws ParseException {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result1 = new SimpleDateFormat("YYYY/MM/dd").format(date);
        String result2 = new SimpleDateFormat("YYYY/MM/dd").format(date);

        // Mutation Operator: Unreachable Switch Statement
        boolean condition = getCondition();
        while (condition) {
            int value = getValue();
            switch(value) {
                case 1:
                    System.out.println("This switch statement is unreachable.");
                    break;
                default:
                    break;
            }
            condition = false; // Avoid infinite loop
        }

        return new String[]{result1, result2};
    }

    // Helper methods to getCondition and getValue
    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }
}