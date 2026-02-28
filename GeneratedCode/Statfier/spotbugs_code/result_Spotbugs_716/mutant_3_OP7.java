import java.io.IOException;
import java.io.OutputStream;

class DereferenceByCalledBuggyMethod {

  /** This method is buggy and we should report a NP warning here */
  public void closeit(OutputStream out) throws IOException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop");
    }
    if (out == null) out.close();
  }

  /** Nothing wrong with this method */
  public void falsePositive() throws IOException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is another unreachable loop");
    }
    closeit(null);
  }

  private boolean getCondition() {
    return false;
  }
}