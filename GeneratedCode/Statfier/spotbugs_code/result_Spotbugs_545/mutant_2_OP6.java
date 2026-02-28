import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

class MethodLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
    return methodNonNull(test);
  }

  @ParametersAreNonnullByDefault
  private String methodNonNull(final String test) {
    return test;
  }

  private boolean getCondition() {
    return false; // This method returns false, making the loop condition always false
  }
}