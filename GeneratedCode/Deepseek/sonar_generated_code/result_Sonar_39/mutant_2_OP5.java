import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;

class DateTimeFormatterBug {
    
    // Generated mutated Java code to avoid unreachable statement error
    boolean condition = getCondition();

    public void showBug() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
              .appendValue(ChronoField.YEAR, 4) 
              .appendLiteral('-')
              .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
              .toFormatter();
        // BUG: DateTimeFormatters should not use mismatched year and week numbers

        // Generated mutated Java code to avoid unreachable statement error
        if (false) {
            System.out.println("Unreachable code block");
        }

        // Generated mutated Java code to avoid unreachable statement error
        while (false) {
            System.out.println("Unreachable code block");
        }

        // Generated mutated Java code to avoid unreachable statement error
        for (int i = 0; false; i++) {
            System.out.println("Unreachable code block");
        }

        // Generated mutated Java code to avoid unreachable statement error
        switch (0) {
            case 1:
                System.out.println("Unreachable code block");
                break;
        }
    }

    public static void main(String[] args) {
        DateTimeFormatterBug bugDemo = new DateTimeFormatterBug();
        bugDemo.showBug();
    }

    // Generated mutated Java code to avoid unreachable statement error
    public boolean getCondition() {
        return false;
    }
}