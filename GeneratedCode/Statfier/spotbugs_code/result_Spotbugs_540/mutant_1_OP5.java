import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class ClassLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        return "Unreachable Case";
      default:
        // Default case will always be executed
        return methodNonNull(test);
    }
  }

  private String methodNonNull(final String test) {
    return test;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}