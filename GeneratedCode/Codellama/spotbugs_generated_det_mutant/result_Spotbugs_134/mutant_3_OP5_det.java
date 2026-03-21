import java.time.*;
import java.util.logging.*;

class BuggyJavaCode {
  public static void main(String[] args) {
    // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
    int juaqcgtt = 0;switch  (juaqcgtt) {case 1:short ywkkxakq = -4880;break;default:boolean shmztvet = true;break;}
    LocalDate date = LocalDate.of(2023, 13, 1);
    System.out.println("Today's date is " + date);
  
}
}