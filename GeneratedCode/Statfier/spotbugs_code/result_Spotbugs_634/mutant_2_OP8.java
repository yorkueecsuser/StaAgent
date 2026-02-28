import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class Bug3593735 {
  public abstract static class BadClassExample {
    @ExpectWarning("UUF_UNUSED_FIELD")
    private String unusedField;

    // Mutant: Renaming 'unusedField' to 'x'
    private String x;

    public abstract void doFoo();
  }

  /**
   * This class is serializable; thus, the field might be present for backwards compatibility with
   * serialized version of the class.
   */
  public abstract static class OkExample implements Serializable {

    private static final long serialVersionUID = 2L;

    @NoWarning("UUF_UNUSED_FIELD")
    private String unusedField;

    // Mutant: Renaming'serialVersionUID' to 'y'
    private static final long y = 2L;

    public abstract void doFoo();
  }
}