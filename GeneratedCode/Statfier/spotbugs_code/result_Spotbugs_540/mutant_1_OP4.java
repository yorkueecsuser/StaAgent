import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class ClassLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed
      return "Unreachable Code";
    } else {
      // This block will also never be executed due to the nature of the condition
      return "Another Unreachable Code";
    }
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    return test;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else is unreachable
  }
}