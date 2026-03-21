import java.time.*;
import java.util.logging.*;

class BuggyJavaCode {
  public static void main(String[] args) {
    // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
    int vomjwzry = 0;switch  (vomjwzry) {case 1:double tshlgtin = -68931116;break;default:String bxiswmvw = "ixgsjpxi";break;}
    LocalDate date = LocalDate.of(2023, 13, 1);
    System.out.println("Today's date is " + date);
  
}
}