import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class Bug3593735 {
  public abstract static class BadClassExample {
    @ExpectWarning("UUF_UNUSED_FIELD")
    private String unusedField;

    public abstract void doFoo();

    // Added unreachable switch statement
    public void someMethod() {
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 1:
                System.out.println("This will never be printed");
                break;
            case 2:
                System.out.println("This will also never be printed");
                break;
        }
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue(boolean condition) {
        if (condition) {
            return 1;
        } else {
            return 0; // Ensures the switch is always unreachable
        }
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

    // Added unreachable switch statement
    public void someMethod() {
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 1:
                System.out.println("This will never be printed");
                break;
            case 2:
                System.out.println("This will also never be printed");
                break;
        }
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue(boolean condition) {
        if (condition) {
            return 1;
        } else {
            return 0; // Ensures the switch is always unreachable
        }
    }
  }
}