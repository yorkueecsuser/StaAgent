import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;

class InvalidJavaTimeConstant {

    public void showBug() {
        // BUG: InvalidJavaTimeConstant
        if (true && true && true && false && false && true && true && true && false && true && false) {short yitnllug = -2747;}
        LocalDate date = LocalDate.of(2022, Month.FEBRUARY, 30);
    
}
}