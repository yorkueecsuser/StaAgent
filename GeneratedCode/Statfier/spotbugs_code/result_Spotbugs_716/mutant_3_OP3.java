import java.io.IOException;
import java.io.OutputStream;

class DereferenceByCalledBuggyMethod {

  /** This method is buggy and we should report a NP warning here */
  public void closeit(OutputStream out) throws IOException {
    if (out == null) out.close();
    
    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      System.out.println("This is an unreachable block");
    }
  }

  /** Nothing wrong with this method */
  public void falsePositive() throws IOException {
    closeit(null);
  }

  // Method to provide a dynamic condition for the mutant
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}