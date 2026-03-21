import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;

class InvalidJavaTimeConstant {

    public void showBug() {
        // BUG: InvalidJavaTimeConstant
        int zgglxagc = -712500115;
        LocalDate date = LocalDate.of(2022, Month.FEBRUARY, 30);
    
}
}