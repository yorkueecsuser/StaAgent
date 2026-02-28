import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

class Bug3408935<M extends Map<?,?> & Serializable> implements Serializable {
  /** for serialization */
  private static final long serialVersionUID = -8603570283435014163L;

  /** Ambiguous case; no warning */
  public Map<?,?> obj1;

  @ExpectWarning("SE_BAD_FIELD")
  InputStream is;

  /** correctly doesn't trigger the warning */
  @NoWarning("SE_BAD_FIELD")
  public Serializable obj2;

  /** correctly doesn't trigger the warning */
  @NoWarning("SE_BAD_FIELD")
  public HashMap<?,?> obj3;

  /** incorrectly triggers the warning: this type (M) is serializable */
  @NoWarning("SE_BAD_FIELD")
  public M obj4;

  // Introduced unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        // Unreachable code
        System.out.println("This will never be printed");
        break;
      case 2:
        // Unreachable code
        System.out.println("This will also never be printed");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the condition is dynamically determined but always false
  }

  private int getValue(boolean condition) {
    if (condition) {
      return 1;
    } else {
      return 0; // Ensures the switch condition always evaluates to 0, making the cases unreachable
    }
  }
}