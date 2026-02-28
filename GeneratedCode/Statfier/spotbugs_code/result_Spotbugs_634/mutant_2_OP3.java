import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class Bug3593735 {
  public abstract static class BadClassExample {
    @ExpectWarning("UUF_UNUSED_FIELD")
    private String unusedField;

    public abstract void doFoo();

    // Mutant: Adding an unreachable if statement
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // This is the only path that can be taken
        System.out.println("This is reachable.");
      }
      // Unreachable if statement
      if (!condition && getUnreachableCondition()) {
        System.out.println("This is unreachable.");
      }
    }

    private boolean getCondition() {
      return true;
    }

    private boolean getUnreachableCondition() {
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

    // Mutant: Adding an unreachable if statement
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // This is the only path that can be taken
        System.out.println("This is reachable.");
      }
      // Unreachable if statement
      if (!condition && getUnreachableCondition()) {
        System.out.println("This is unreachable.");
      }
    }

    private boolean getCondition() {
      return true;
    }

    private boolean getUnreachableCondition() {
      return false;
    }
  }
}