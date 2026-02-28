import java.io.IOException;
import java.io.OutputStream;

class DereferenceByCalledBuggyMethod {

  /** This method is buggy and we should report a NP warning here */
  public void closeit(OutputStream out) throws IOException {
    if (out == null) out.close();
    // Mutant: Duplicate the condition check without method invocation
    if (out == null) System.out.println("This is a mutant statement");
  }

  /** Nothing wrong with this method */
  public void falsePositive() throws IOException {
    closeit(null);
  }
}