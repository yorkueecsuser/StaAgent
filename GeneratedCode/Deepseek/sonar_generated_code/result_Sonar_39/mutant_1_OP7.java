import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;

class DateTimeFormatterBug {
    public void showBug() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
              .appendValue(ChronoField.YEAR, 4) // Noncompliant: using week of week-based year with regular year
              .appendLiteral('-')
              .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
              .toFormatter();
        // BUG: DateTimeFormatters should not use mismatched year and week numbers

        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code block will never be executed since the condition is always false
        }
    }

    public static void main(String[] args) {
        DateTimeFormatterBug bugDemo = new DateTimeFormatterBug();
        bugDemo.showBug();
    }

    public boolean getCondition() {
        // This method returns a constant value to ensure the unreachable while loop
        return false;
    }
}