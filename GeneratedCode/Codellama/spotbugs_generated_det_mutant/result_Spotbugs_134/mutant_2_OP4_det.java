import java.time.*;
import java.util.logging.*;

class BuggyJavaCode {
  public static void main(String[] args) {
    // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
    if (true && false && false && true && false && false && false && true && true && false && false) {double qllhdfvb = -481341633;}else{String ndjfjdrz = "tcernkaw";}
    LocalDate date = LocalDate.of(2023, 13, 1);
    System.out.println("Today's date is " + date);
  
}
}