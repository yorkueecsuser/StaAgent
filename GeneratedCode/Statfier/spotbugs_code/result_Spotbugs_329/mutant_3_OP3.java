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
    // Introduced an unreachable if statement
    boolean condition = getCurrentYearIsBefore1930();
    if (condition) {
      beltSize = 0; // This line is unreachable
    }
  }

  public int beltSize() {
    return beltSize;
  }

  public static void main(String args[]) {
    System.out.println("Elvis wears size " + INSTANCE.beltSize() + " belt.");
  }

  // Method to simulate a dynamic condition that is always false
  private boolean getCurrentYearIsBefore1930() {
    return Calendar.getInstance().get(Calendar.YEAR) < 1930;
  }
}