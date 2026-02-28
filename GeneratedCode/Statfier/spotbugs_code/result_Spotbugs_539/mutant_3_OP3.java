import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.CheckForNull;

class Bug3506402 {

  @ExpectWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
  protected int caller(@CheckForNull Object param) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in caller method.");
    }
    return param.hashCode();
  }

  @DesireWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
  protected Object method(@CheckForNull Object... params) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in method method.");
    }
    return params.length;
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if blocks are unreachable
    return false;
  }
}