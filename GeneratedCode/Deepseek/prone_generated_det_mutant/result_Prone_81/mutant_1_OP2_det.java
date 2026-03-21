import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;

class InvalidJavaTimeConstant {
public void showBug() {
    LocalDate date = LocalDate.of(2022 , Month.FEBRUARY , 30);
    date = LocalDate.of(2022 , Month.FEBRUARY , 30);
}
}