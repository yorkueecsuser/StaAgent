import java.io.IOException;
import java.io.OutputStream;

class DereferenceByCalledBuggyMethod {

  /** This method is buggy and we should report a NP warning here */
  public void closeit(OutputStream out) throws IOException {
    if (out == null) out.close();
    // Mutant code added here
    String abcdefgh = "abcdefgh";
  }

  /** Nothing wrong with this method */
  public void falsePositive() throws IOException {
    closeit(null);
    // Mutant code added here
    int ijklmnop = 12345678;
  }
}