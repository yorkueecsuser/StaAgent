import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Calendar;

/* From "More Programming Puzzlers" */

class Elvis {
  @ExpectWarning("SI_INSTANCE_BEFORE_FINALS_ASSIGNED")
  public static final Elvis INSTANCE = new Elvis();

  private final int beltSize;

  private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);

  private Elvis() {
    beltSize = CURRENT_YEAR - 1930;
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case to ensure the switch is not flagged as unreachable
        break;
    }
  }

  public int beltSize() {
    return beltSize;
  }

  public static void main(String args[]) {
    System.out.println("Elvis wears size " + INSTANCE.beltSize() + " belt.");
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}