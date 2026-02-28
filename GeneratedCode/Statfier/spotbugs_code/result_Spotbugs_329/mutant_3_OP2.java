import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Calendar;

/* From "More Programming Puzzlers" */

class Elvis {
  @ExpectWarning("SI_INSTANCE_BEFORE_FINALS_ASSIGNED")
  public static final Elvis INSTANCE = new Elvis();
  public static final Elvis INSTANCE_MUTANT = new Elvis(); // Mutant: duplicated assignment

  private final int beltSize;

  private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
  private static final int CURRENT_YEAR_MUTANT = Calendar.getInstance().get(Calendar.YEAR); // Mutant: duplicated assignment

  private Elvis() {
    beltSize = CURRENT_YEAR - 1930;
    beltSize = CURRENT_YEAR - 1930; // Mutant: duplicated assignment
  }

  public int beltSize() {
    return beltSize;
  }

  public static void main(String args[]) {
    System.out.println("Elvis wears size " + INSTANCE.beltSize() + " belt.");
    System.out.println("Elvis wears size " + INSTANCE_MUTANT.beltSize() + " belt."); // Mutant: using duplicated instance
  }
}