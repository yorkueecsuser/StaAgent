import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.CheckForNull;

class Bug3506402 {

  @ExpectWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
  protected int caller(@CheckForNull Object param) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print");
    } else {
      // Alternative code that also should never run
      System.out.println("This should also never print");
    }
    return param.hashCode();
  }

  @DesireWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
  protected Object method(@CheckForNull Object... params) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print in method");
    } else {
      // Alternative code that also should never run
      System.out.println("This should also never print in method");
    }
    return params.length;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}