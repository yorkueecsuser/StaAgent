import java.time.*;
import java.util.logging.*;

class BuggyJavaCode {
  public static void main(String[] args) {
    // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
    int yjbcbshv = 0;switch  (yjbcbshv) {case 1:float nilleqgt = -699306762;break;default:byte jmtjpkym = 92;break;}
    LocalDate date = LocalDate.of(2023, 13, 1);
    System.out.println("Today's date is " + date);
  
}
}