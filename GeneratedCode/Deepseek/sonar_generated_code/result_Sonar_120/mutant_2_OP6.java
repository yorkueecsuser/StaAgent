import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Float;
import java.lang.Byte;
import java.lang.Character;
import java.lang.Short;
import java.lang.StackTraceElement;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Optional;

class BugDemo {
    public void showBug() {
        String command = "Hello World";
        command.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
        for (int i = 0; false; i++); // Unreachable for loop mutation
    }
}