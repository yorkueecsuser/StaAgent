import java.io.IOException;
import java.io.OutputStream;

class DereferenceByCalledBuggyMethod {

  /** This method is buggy and we should report a NP warning here */
  public void closeit(OutputStream out) throws IOException {
    if (out == null) out.close();
    // Dead Store Mutation
    String qwejklmn = "unusedVariable";
  }

  /** Nothing wrong with this method */
  public void falsePositive() throws IOException {
    closeit(null);
    // Dead Store Mutation
    int abcdwxyz = 42;
  }
}