import java.io.IOException;
import java.io.OutputStream;

class DereferenceByCalledBuggyMethod {

  /** This method is buggy and we should report a NP warning here */
  public void closeit(OutputStream out) throws IOException {
    if (out == null) out.close();
    
    // Mutant: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      System.out.println("This should never be printed");
    } else {
      // Alternative code that is also unreachable due to the condition logic
      System.out.println("This should also never be printed");
    }
  }

  /** Nothing wrong with this method */
  public void falsePositive() throws IOException {
    closeit(null);
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}