import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class Bug3593735 {
  public abstract static class BadClassExample {
    @ExpectWarning("UUF_UNUSED_FIELD")
    private String unusedField;

    public abstract void doFoo();

    // Inserting an unreachable for loop
    public void someMethod() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will return false
        }
    }

    private boolean getCondition() {
        return false;
    }
  }

  /**
   * This class is serializable; thus, the field might be present for backwards compatibility with
   * serialized version of the class.
   */
  public abstract static class OkExample implements Serializable {

    private static final long serialVersionUID = 2L;

    @NoWarning("UUF_UNUSED_FIELD")
    private String unusedField;

    public abstract void doFoo();

    // Inserting an unreachable for loop
    public void someMethod() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will return false
        }
    }

    private boolean getCondition() {
        return false;
    }
  }
}