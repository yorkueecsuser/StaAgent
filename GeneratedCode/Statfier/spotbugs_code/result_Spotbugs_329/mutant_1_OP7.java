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
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is always false
    }
  }

  public int beltSize() {
    return beltSize;
  }

  public static void main(String args[]) {
    System.out.println("Elvis wears size " + INSTANCE.beltSize() + " belt.");
  }

  private boolean getCondition() {
    // This method returns false, making the while loop unreachable
    return false;
  }
}