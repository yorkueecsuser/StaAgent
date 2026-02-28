import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    private int getUnreachableValue() {
        return 0;
    }

    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // BUG: Week Year ("YYYY") should not be used for date formatting

        // Mutant code
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This code will never be executed as unreachableValue is always 0
                System.out.println("This is an unreachable switch statement mutant");
                break;
        }

        return result;
    }
}