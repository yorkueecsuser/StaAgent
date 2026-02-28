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
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      beltSize = 0;
    } else {
      // This block will always execute
      beltSize = CURRENT_YEAR - 1930;
    }
  }

  private boolean getCondition() {
    return false;
  }

  public int beltSize() {
    return beltSize;
  }

  public static void main(String args[]) {
    System.out.println("Elvis wears size " + INSTANCE.beltSize() + " belt.");
  }
}