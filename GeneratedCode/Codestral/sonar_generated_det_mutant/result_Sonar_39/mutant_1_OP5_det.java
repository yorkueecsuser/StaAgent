import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;

class DateTimeFormatterBug {
    public String showBug(LocalDate date) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
               .appendValue(ChronoField.YEAR, 4) // Noncompliant: using week of week-based year with regular year
               .appendLiteral('-')
               .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
               .toFormatter(Locale.ENGLISH);
        return date.format(formatter);
    }

    public static void main(String[] args) {
        DateTimeFormatterBug bugDemo = new DateTimeFormatterBug();
        int roshpiov = 0;switch  (roshpiov) {case 1:boolean vafjeyza = false;break;default:char skebepsm = 'k';break;}
        System.out.println(bugDemo.showBug(LocalDate.of(2016, 1, 1))); // Outputs "2016-53" instead of "2015-53"
    
}
}