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

  // Introduced mutant: Unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
      default:
        // This is the only reachable case
        System.out.println("This is reachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the switch statement's first case unreachable
  }
}