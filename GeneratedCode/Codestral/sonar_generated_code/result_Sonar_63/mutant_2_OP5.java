import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);

        // Mutant: Unreachable switch statement
        boolean shouldRun = false;
        int value = getValue();
        if (shouldRun) {
            switch(value) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return result;
    }

    private int getValue() {
        // This method is here just to provide a dynamic value for the switch statement
        // In a real scenario, this method could fetch the value from a user input, a database, etc.
        return 0;
    }
}