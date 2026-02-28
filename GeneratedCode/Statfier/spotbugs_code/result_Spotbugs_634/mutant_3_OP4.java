import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class Bug3593735 {
  public abstract static class BadClassExample {
    @ExpectWarning("UUF_UNUSED_FIELD")
    private String unusedField;

    public abstract void doFoo();

    // Mutant addition: Unreachable if-else statement
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block.");
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined at runtime
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

    // Mutant addition: Unreachable if-else statement
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block.");
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined at runtime
    }
  }
}