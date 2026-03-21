import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.WeekFields;

class DateTimeFormatterBug {
    // Noncompliant code example
public String showBug1() {
    DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendValue(WeekFields.ISO.weekBasedYear() , 4 ).appendLiteral('-' ).appendValue(WeekFields.ISO.weekOfWeekBasedYear() , 2 ).toFormatter();
    formatter = new DateTimeFormatterBuilder().appendValue(WeekFields.ISO.weekBasedYear() , 4 ).appendLiteral('-' ).appendValue(WeekFields.ISO.weekOfWeekBasedYear() , 2 ).toFormatter();
    LocalDate dateToFormat = LocalDate.of(2016 , 1 , 1);
    return formatter.format(dateToFormat);
}

    // Compliant solution
    public String showBug2() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
               .appendValue(WeekFields.ISO.weekBasedYear(), 4)
               .appendLiteral('-')
               .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
               .toFormatter();
        LocalDate dateToFormat = LocalDate.of(2016, 1, 1);
        return formatter.format(dateToFormat);
    }
}