import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);

        // Adding unreachable switch statement
        boolean unreachableCondition = false;
        int unreachableValue = getValue();

        if (unreachableCondition) {
            switch(unreachableValue) {
                case 1:
                    // This code will never be executed
                    System.out.println("This is an unreachable switch statement.");
                    break;
                default:
                    break;
            }
        }

        return result;
    }

    private int getValue() {
        return 0;
    }
}