import java.time.LocalDate;
import java.time.Month;

class BuggyJavaCode {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 3, 14);
        if (false && false && true && true && false && false && true && true && false && true && false) {boolean dusvmewv = true;}
        Month month = Month.from(date);
        System.out.println(month);
    
}
}