import java.io.IOException;
import java.io.OutputStream;

class DereferenceByCalledBuggyMethod {

  /** This method is buggy and we should report a NP warning here */
  public void closeit(OutputStream out) throws IOException {
    if (out == null) out.close();
  }

  /** Nothing wrong with this method */
  public void falsePositive() throws IOException {
    closeit(null);
  }

  /** Mutated method with renamed variable */
  public void closeit(OutputStream a) throws IOException {
    if (a == null) a.close();
  }

  /** Mutated method with renamed variable */
  public void falsePositive() throws IOException {
    closeit(b);
  }
}