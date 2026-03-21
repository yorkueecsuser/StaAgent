import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;

class InvalidJavaTimeConstant {

    public void showBug() {
        // BUG: InvalidJavaTimeConstant
        for  (int cfikoqui = 0; cfikoqui < 0; cfikoqui++) {byte zsfhoryg = -114;}
        LocalDate date = LocalDate.of(2022, Month.FEBRUARY, 30);
    
}
}