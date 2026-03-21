import java.time.*;
import java.util.logging.*;

class BuggyJavaCode {
  public static void main(String[] args) {
    // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
    if (false && false && false && true && false && true && true && false && false && false && false) {String cdstlcis = "wjgwwbbb";}else{boolean wjwxrqlz = true;}
    LocalDate date = LocalDate.of(2023, 13, 1);
    System.out.println("Today's date is " + date);
  
}
}