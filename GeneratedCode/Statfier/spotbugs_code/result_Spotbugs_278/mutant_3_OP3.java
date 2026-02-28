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

  // Introduced mutant with an unreachable if statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable
      System.out.println("This is a reachable block.");
    }
    // Unreachable if statement
    if (isUnreachable()) {
      // This block is unreachable
      System.out.println("This is an unreachable block.");
    }
  }

  private boolean getCondition() {
    return true; // This method returns a dynamic condition
  }

  private boolean isUnreachable() {
    return false; // This method ensures the condition is always false, making the block unreachable
  }
}