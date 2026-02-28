import java.io.IOException;
import java.io.OutputStream;

class DereferenceByCalledBuggyMethod {

  /** This method is buggy and we should report a NP warning here */
  public void closeit(OutputStream out) throws IOException {
    if (out == null) out.close();
    
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable code");
        break;
    }
  }

  /** Nothing wrong with this method */
  public void falsePositive() throws IOException {
    closeit(null);
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}