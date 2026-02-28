import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {

    public String[] showBug() throws ParseException {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result1 = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting
        String result2 = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting

        // Mutant Code 1: Unreachable While Loop
        boolean condition = false;
        while (condition) {
            int unreachable = 1;
            unreachable++;
        }

        // Mutant Code 2: Unreachable For Loop
        int i = 0;
        for (boolean conditionFor = false; conditionFor; i++) {
            int unreachableFor = 1;
            unreachableFor++;
        }

        // Mutant Code 3: Unreachable If Statement
        if (false) {
            int unreachableIf = 1;
            unreachableIf++;
        }

        // Mutant Code 4: Unreachable Switch Statement
        int value = getValue();
        switch (value) {
            case 1:
                int unreachableSwitch = 1;
                unreachableSwitch++;
                break;
            default:
                break;
        }

        return new String[]{result1, result2};
    }

    private int getValue() {
        return 0;
    }
}