import java.time.*;
import java.util.logging.*;

class BuggyJavaCode {
  public static void main(String[] args) {
    // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
    if (false && false && true && false && false && false && false && true && false && false && false) {char qdebhywu = 'w';}
    LocalDate date = LocalDate.of(2023, 13, 1);
    System.out.println("Today's date is " + date);
  
}
}