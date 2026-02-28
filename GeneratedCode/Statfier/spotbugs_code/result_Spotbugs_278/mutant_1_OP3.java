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

  // Mutant code starts here
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some reachable code
      System.out.println("This is reachable code.");
    }
    // Unreachable if statement
    if (getUnreachableCondition()) {
      // This block is intended to be unreachable
      System.out.println("This is unreachable code.");
    }
  }

  private boolean getCondition() {
    return true; // This ensures the first if block is reachable
  }

  private boolean getUnreachableCondition() {
    return false; // This ensures the second if block is unreachable
  }
}