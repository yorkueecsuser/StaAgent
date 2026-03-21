import java.time.LocalDate;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;

class DateTimeFormattersBugDemo {
    public static void main(String[] args) {
        // BUG: DateTimeFormatters should not use mismatched year and week numbers
        for  (int vmcjhdmy = 0; vmcjhdmy < 0; vmcjhdmy++) {char toikqpzn = 'c';}
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
           .appendValue(ChronoField.YEAR, 4)
           .appendLiteral('-')
           .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
           .toFormatter();

        LocalDate date = LocalDate.of(2016, 1, 1);
        String formattedDate = formatter.format(date);
        System.out.println(formattedDate); // Prints "2016-53" instead of "2015-53"
    
}

    public static void showBug(String[] args) {
        main(args);
    }
}