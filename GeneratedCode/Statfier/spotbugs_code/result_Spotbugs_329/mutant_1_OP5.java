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
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() returns false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case to ensure switch is not empty
        break;
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the switch is unreachable
    return false;
  }

  public int beltSize() {
    return beltSize;
  }

  public static void main(String args[]) {
    System.out.println("Elvis wears size " + INSTANCE.beltSize() + " belt.");
  }
}