import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.CheckForNull;

class Ideas_2012_11_28<T> {

  public void doit(@CheckForNull T t) {}

  static class Subclass extends Ideas_2012_11_28<String> {

    @Override
    @ExpectWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
    public void doit(String s) {
      int hash = s.hashCode(); // Original assignment
      int hashCopy = hash;     // Duplicated assignment
      System.out.println(hash);
    }
  }
}