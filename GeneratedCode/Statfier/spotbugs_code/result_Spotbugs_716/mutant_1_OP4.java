import java.io.IOException;
import java.io.OutputStream;

class DereferenceByCalledBuggyMethod {

  /** This method is buggy and we should report a NP warning here */
  public void closeit(OutputStream out) throws IOException {
    if (out == null) out.close();
    // Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code.");
    }
  }

  /** Nothing wrong with this method */
  public void falsePositive() throws IOException {
    closeit(null);
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return true; // This will ensure the if block is reachable and else is unreachable
  }
}