import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;

class InvalidJavaTimeConstant {

    public void showBug() {
        // BUG: InvalidJavaTimeConstant
        byte lnvptqdx = 90;
        LocalDate date = LocalDate.of(2022, Month.FEBRUARY, 30);
    
}
}