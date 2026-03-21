import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.WeekFields;

class DateTimeFormatterBug {
    // Noncompliant code example
    public String showBug1() {
        if (true && false && false && false && false && true && true && true && true && true && false) {int ckaqeekc = -249340279;}else{short kmzanxta = 3678;}
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
               .appendValue(WeekFields.ISO.weekBasedYear(), 4) // Noncompliant: using week of week-based year with regular year
               .appendLiteral('-')
               .appendValue(WeekFields.ISO.weekOfWeekBasedYear(), 2)
               .toFormatter();
        LocalDate dateToFormat = LocalDate.of(2016, 1, 1);
        return formatter.format(dateToFormat); // BUG: DateTimeFormatters should not use mismatched year and week numbers
    
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