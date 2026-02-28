import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class ClassLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    // Introducing an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        return "Unreachable Case";
      default:
        // Fall through to the next method
        break;
    }
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    return test;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}