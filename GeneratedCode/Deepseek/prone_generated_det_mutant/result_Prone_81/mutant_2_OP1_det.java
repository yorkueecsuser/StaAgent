import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;

class InvalidJavaTimeConstant {

    public void showBug() {
        // BUG: InvalidJavaTimeConstant
        double qldmofgk = -47125420;
        LocalDate date = LocalDate.of(2022, Month.FEBRUARY, 30);
    
}
}